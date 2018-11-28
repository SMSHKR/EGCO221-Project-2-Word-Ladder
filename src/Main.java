import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Main {

    public static void main(String [] args) {

        boolean opened = false;
        String infile = "in/words_5757.txt";
        Scanner scan = new Scanner(System.in);

        WordGraph graph = null;

        while (!opened) {
            try (Scanner file = new Scanner(new File(infile))) {

                opened = true;
                graph = new WordGraph(file);

            } catch (FileNotFoundException e) {
                System.err.println(infile + " File Not Found.");
                System.out.print("Enter data file = ");
                infile = scan.nextLine();
            }
        }

        System.out.print("Enter 5-letter word 1 = ");
        String word1 = scan.nextLine();

        System.out.print("Enter 5-letter word 2 = ");
        String word2 = scan.nextLine();

        System.out.println();

        graph.wordLadder(word1, word2);

    }

}




