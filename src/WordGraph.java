import org.jgrapht.Graph;
import org.jgrapht.GraphPath;
import org.jgrapht.Graphs;
import org.jgrapht.alg.shortestpath.DijkstraShortestPath;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleDirectedWeightedGraph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static java.lang.Math.abs;

public class WordGraph extends Thread {

    private Scanner file;

    private ArrayList<String> words = new ArrayList<>();

    private Graph<String, DefaultWeightedEdge> G;
    private SimpleDirectedWeightedGraph<String, DefaultWeightedEdge> SG;

    private DijkstraShortestPath<String, DefaultWeightedEdge> DSP;

    public WordGraph(Scanner file) { this.file = file; }

    @Override
    public void run() {

        while (file.hasNext()) {
            String word = file.nextLine();
            words.add(word);
        }

        Collections.sort(words);

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

        DSP = new DijkstraShortestPath<>(SG);

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

    private String input(String description) {
        System.out.print(description);
        Scanner scan = new Scanner(System.in);
        return scan.nextLine().toLowerCase();
    }

    public void wordLadder() {

        boolean found;
        String from = "";
        String to = "";

        found = false;
        while (!found) {
            from = input("Enter word to \u2630 from : ");
            if (from.equals("")) return;
            found = validate(from);
        }

        found = false;
        while (!found) {
            to = input("Enter word to \u2630 to : ");
            if (to.equals("")) return;
            found = validate(to);
        }

        System.out.println();

        try {
            GraphPath<String, DefaultWeightedEdge> path = DSP.getPath(from, to);

            if (path == null) throw new IllegalArgumentException();

            System.out.println(from);
            for (DefaultWeightedEdge e : path.getEdgeList())
                System.out.printf("%s (+%.0f)\n", G.getEdgeTarget(e), G.getEdgeWeight(e));

            System.out.printf("\nTotal cost = %.0f\n", path.getWeight());

        } catch (IllegalArgumentException e) { System.out.println("Cannot transform " + from + " into " + to); }

    }

    private boolean validate(String word) {
        if (words.contains(word)) return true;
        System.err.println(word + " is not in word list");
        return false;
    }

    public void search() {

        String word = "";

        boolean valid = false;
        while (!valid) {
            word = input("\u2315 : ");
            if (word.equals("")) return;
            if (word.length() <= 5) valid = true;
            else System.err.println("Invalid Input.");
        }

        System.out.println("Found word(s) :");
        final String finalWord = word;
        words.stream()
             .filter(arg -> arg.startsWith(finalWord))
             .forEach(System.out::println);

    }

}
