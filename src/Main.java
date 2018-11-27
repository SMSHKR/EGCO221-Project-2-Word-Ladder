

import java.util.ArrayList;
import java.util.HashSet;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    File infile;
    public static boolean isNeighbor(String a, String b) {
        assert a.length() == b.length();
        int differ = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) differ++;
            if (differ > 1) return false;
        }
        return true;
    }
public  Main()  {
readfile();



}
public void readfile(){
    System.out.printf("Enter data file =");
    Scanner scanin=new Scanner(System.in);
    String file=scanin.nextLine();
    infile = new File("in/"+file);
    try{
        Scanner scan=new Scanner(infile);
        IndexSET<String> word=new IndexSET<>() ;
        while(scan.hasNext()){

            String words=scan.nextLine();
            word.add(words);



        }
        Graph wordlibrary=new Graph(word.size());
        for (String word1 : word.keys()) {
            for (String word2 : word.keys()) {
                if (word1.length() != word2.length()) {
                    throw new RuntimeException("Words have different lengths");
                }
                if (word1.compareTo(word2) < 0 && isNeighbor(word1, word2)) {
                    wordlibrary.addEdge(word.indexOf(word1), word.indexOf(word2));
                }
            }
        }
        System.out.printf("Enter 5-letter word 1=");
String begin=scanin.nextLine();
        System.out.printf("Enter 5-letter word 2=");
String end=scanin.nextLine();
        while (!StdIn.isEmpty()) {
            String from = begin;
            String to   = end;
            if (!word.contains(from)) throw new RuntimeException(from + " is not in word list");
            if (!word.contains(to))   throw new RuntimeException(to   + " is not in word list");

            BreadthFirstPaths bfs = new BreadthFirstPaths(wordlibrary, word.indexOf(from));
            if (bfs.hasPathTo(word.indexOf(to))) {
                StdOut.println("length = " + bfs.distTo(word.indexOf(to)));
                for (int v : bfs.pathTo(word.indexOf(to))) {
                    StdOut.println(word.keyOf(v));
                }
            }
            else StdOut.println("NOT CONNECTED");
            StdOut.println();
        }
    }catch(FileNotFoundException e){
        System.out.println("file not found");
readfile();
    }

}




    public static void main(String[] args) {

        System.out.println("Initializing...");
Main a=new Main();
    }

}


