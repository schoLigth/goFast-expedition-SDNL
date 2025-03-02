package ProjekSDNL;

import ProjekSDNL.Graphh.ShortestPathResult;
import ProjekSDNL.Graphh;

public class Main {

    public static void main(String[] args) {
        int vertices = 7;
        Graphh graph = new Graphh(vertices);
        String[] daerah = {"cilacap", "banyumas", "purbalingga", "kebumen", "purworejo", "wonosobo", "magelang"};
        
        graph.addEdge(0, 1, 41);        // Cilacap - Bayumas
        graph.addEdge(0, 2, 82);      // Cilacap - Purbalingga
        graph.addEdge(0, 6, 167);   // Cilacap - Magelang
        graph.addEdge(0, 4, 124);   // Cilacap - Purworejo
        graph.addEdge(1, 2, 42);     // Bayumas -  Purbalingga
        graph.addEdge(1, 4, 117);   // Bayumas - Purworejo
        graph.addEdge(2, 3, 75);    // Purbalingga - Kebumen
        graph.addEdge(3, 4, 42);    // Kebumen - Purworejo
        graph.addEdge(4, 5, 54);    // Purworejo - Wonosobo
        graph.addEdge(5, 6, 61);    // Wonosobo - Magelang    
        graph.addEdge(6, 2, 128);     // Magelang - Purbalingga
        graph.addEdge(6, 3, 86);         // Magelang - Kebumen
        graph.addEdge(1, 3, 77);        // Bayumas - Kebumen

        int source = 0;
        int destination = 5;

        ShortestPathResult result = graph.getShortestPath(source, destination);

        System.out.println("Shortest path from vertex " + daerah[source].toUpperCase() + " to " + daerah[destination].toUpperCase() + ": " + result.getPath());
        System.out.println("Shortest path cost: " + result.getCost());

    }
}
