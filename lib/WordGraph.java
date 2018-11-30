import java.util.Scanner;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class WordGraph extends Thread {

    private IndexSET<String> words = new IndexSET<>();
    private CyclicBarrier barrier;
    private Scanner file;
    private Graph G;

    public WordGraph(Scanner file, CyclicBarrier barrier) {
        this.file = file;
        this.barrier = barrier;
    }

    @Override
    public void run() {

        while (file.hasNext()) {
            String word = file.nextLine();
            words.add(word);
        }

        G = new Graph(words.size());
        for (String word1 : words.keys()) {
            for (String word2 : words.keys()) {
                if (word1.length() != word2.length())
                    throw new RuntimeException("Words have different lengths");

                if (word1.compareTo(word2) < 0 && isNeighbor(word1, word2)) {
                    G.addEdge(words.indexOf(word1), words.indexOf(word2));
                }
            }
        }

        try { barrier.await(); }
        catch (InterruptedException | BrokenBarrierException e) { }

    }

    public void wordLadder(String from, String to) {
        if (!words.contains(from)) throw new RuntimeException(from + " is not in word list");
        if (!words.contains(to))   throw new RuntimeException(to   + " is not in word list");

        BreadthFirstPaths bfs = new BreadthFirstPaths(G, words.indexOf(from));
        if (bfs.hasPathTo(words.indexOf(to))) {
            StdOut.println("length = " + bfs.distTo(words.indexOf(to)));
            for (int v : bfs.pathTo(words.indexOf(to)))
                StdOut.println(words.keyOf(v));
        }
        else StdOut.println("Cannot transform " + from + " to " + to);
        StdOut.println();
    }

    private static boolean isNeighbor(String a, String b) {
        assert a.length() == b.length();
        int differ = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) differ++;
            if (differ > 1) return false;
        }
        return differ == 1;
    }

}
