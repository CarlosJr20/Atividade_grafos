
import java.io.*;
import java.util.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
 
class atv1G {
 
    
    private static final LinkedList<LinkedList<Integer>> Adj = null;


    static void
    addEdge(LinkedList<LinkedList<Integer> > Adj, int u, int v)
    {
        Adj.get(u).add(v);
    }

    static void
    printadjacencylist(LinkedList<LinkedList<Integer> > adj)
    {
        for (int i = 0; i < adj.size(); ++i) {

            if (adj.get(i).size() != 0) {
                System.out.print(i + "->");
                for (int v : adj.get(i)) {
 
                    System.out.print(v + " ");
                }
 
                System.out.println();
            }
        }
    }
 
  
    public static void main(String[] args)
    {
          String fileName = "pequenoG.txt";
          
        try {
            Scanner sc = new Scanner(new File(fileName));
            while (sc.hasNextLine()) {
                
                int line = sc.nextInt();
                addEdge(Adj, line, 0);
                LinkedList<LinkedList<Integer> > adj = new LinkedList<LinkedList<Integer> >();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // int V = 5;
 
        LinkedList<LinkedList<Integer> > adj = new LinkedList<LinkedList<Integer> >();
 
        // for (int i = 0; i < V; ++i) {
        //     adj.add(new LinkedList<Integer>());
        // }
     
        // addEdge(adj, 0, 1);
        // addEdge(adj, 0, 4);
        // addEdge(adj, 1, 2);
 
        printadjacencylist(adj);
    }
}