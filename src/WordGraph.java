import java.util.Scanner;

public class WordGraph {

    private IndexSET<String> words = new IndexSET<>();
    private Graph G;

    public WordGraph(Scanner file) {

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
        else StdOut.println("NOT CONNECTED");
        StdOut.println();
    }

    private static boolean isNeighbor(String a, String b) {
        assert a.length() == b.length();
        int differ = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) differ++;
            if (differ > 1) return false;
        }
        return true;
    }

}
