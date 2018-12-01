import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Main {

    private static String infile = "in/words_5757.txt";
    private static WordGraph graph;

    public static void main(String [] args) {

        boolean opened = false;
        while (!opened) {
            try (Scanner file = new Scanner(new File(infile))) {

                opened = true;
                graph = new WordGraph(file);
                graph.start();

                int count = 0;
                while (!graph.getState().equals(Thread.State.TERMINATED)) {

                    switch (++count) {
                        case 1 : System.out.print("\rInitializing .");  break;
                        case 2 : System.out.print("\rInitializing . .");  break;
                        case 3 : System.out.print("\rInitializing . . ."); break;
                        default:
                            System.out.print("\rInitializing");
                            count = 0;
                            break;
                    }

                    try { Thread.sleep(300); }
                    catch (InterruptedException e) { }

                }

                System.out.println("\rInitialization completed.");

            } catch (FileNotFoundException e) { inputFile(); }
        }

        boolean continued = true;
        while (continued) continued = menu();

    }

    private static boolean menu() {

        System.out.println();
        System.out.println("Select Mode");
        System.out.println("1. Search Mode");
        System.out.println("2. Word Ladder Mode");
        System.out.println("Select anything else to exit");

        System.out.println();
        System.out.print  ("Choice : ");
        int choice = inputChoice();
        System.out.println();

        switch (choice) {
            case 1 : graph.search(); break;
            case 2 : graph.wordLadder(); break;
            default: return false;
        }

        return true;

    }

    private static int inputChoice() {
        Scanner scan = new Scanner(System.in);
        int choice;
        try {
            choice = Integer.parseInt(scan.next());
            if (choice < 1 || choice > 2) throw new Exception();
        }
        catch (Exception e) { return 0; }
        return choice;
    }

    private static void inputFile() {
        Scanner scan = new Scanner(System.in);
        System.err.println(infile + " File Not Found.");
        System.out.print("Enter data file = ");
        infile = scan.nextLine();
    }

}




