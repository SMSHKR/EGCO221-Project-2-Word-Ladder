import org.jgrapht.Graph;
import org.jgrapht.GraphPath;
import org.jgrapht.Graphs;
import org.jgrapht.alg.shortestpath.DijkstraShortestPath;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleDirectedWeightedGraph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

import static java.lang.Math.abs;

public class WordGraph extends Thread {

    private CyclicBarrier barrier;
    private Scanner file;

    private ArrayList<String> words = new ArrayList<>();

    private Graph<String, DefaultWeightedEdge> G;
    private SimpleDirectedWeightedGraph<String, DefaultWeightedEdge> SG;

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

        SG = new SimpleDirectedWeightedGraph<>(DefaultWeightedEdge.class);
        G  = SG;

        for (String word1 : words)
            for (String word2 : words) {

                if (word1.length() != word2.length())
                    throw new RuntimeException("Words have different lengths");

                if (word1.compareTo(word2) < 0 && isNeighbor(word1, word2)) {
                    int diff = charDiff(word1, word2);
                    // System.out.println("addEdge " + word1 + ", " + word2 + " diff : " + diff);
                    Graphs.addEdgeWithVertices(G, word1, word2, diff);
                    Graphs.addEdgeWithVertices(G, word2, word1, diff);
                }

            }

        try { barrier.await(); }
        catch (InterruptedException | BrokenBarrierException e) { }

    }

    private boolean isNeighbor(String a, String b) {
        int differ = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) differ++;
            if (differ > 1) return false;
        }
        return true;
    }

    private int charDiff(String a, String b) {
        for (int i = 0; i < a.length(); i++)
            if (a.charAt(i) != b.charAt(i))
                return abs(a.charAt(i) - b.charAt(i));
        return -1;
    }

    public void wordLadder() {

        Scanner scan = new Scanner(System.in);

        boolean found;
        String from = "";
        String to = "";

        found = false;
        while (!found) {
            System.out.print("Enter word to transform from : ");
            from = scan.nextLine().toLowerCase();
            found = validate(from);
        }

        found = false;
        while (!found) {
            System.out.print("Enter word to transform to : ");
            to = scan.nextLine().toLowerCase();
            found = validate(to);
        }

        System.out.println();

        DijkstraShortestPath<String, DefaultWeightedEdge> DSP = new DijkstraShortestPath<>(SG);
        try {
            GraphPath<String, DefaultWeightedEdge> path = DSP.getPath(from, to);

            System.out.println(from);
            for (DefaultWeightedEdge e : path.getEdgeList())
                System.out.printf("%s (+%.0f)\n", G.getEdgeTarget(e), G.getEdgeWeight(e));

            System.out.printf("\nTotal cost = %.0f", path.getWeight());

        } catch (IllegalArgumentException e) { System.out.println("Cannot transform " + from + " into " + to); }

    }

    private boolean validate(String word) {
        if (words.contains(word)) return true;
        System.err.println(word + " is not in word list");
        return false;
    }

}
