import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

class Main {

    public static void main(String [] args) {

        boolean opened = false;
        String infile = "in/words_5757.txt";
        Scanner scan = new Scanner(System.in);

        WordGraph graph = null;
        CyclicBarrier barrier = new CyclicBarrier(2);

        while (!opened) {
            try (Scanner file = new Scanner(new File(infile))) {

                opened = true;
                graph = new WordGraph(file, barrier);
                graph.start();

                int count = 0;
                while (barrier.getNumberWaiting() < 1) {

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

            } catch (FileNotFoundException e) {
                System.err.println(infile + " File Not Found.");
                System.out.print("Enter data file = ");
                infile = scan.nextLine();
            }
        }

        try { barrier.await(); }
        catch (InterruptedException | BrokenBarrierException e) { }

        graph.wordLadder();

    }

}




