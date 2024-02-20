package graph;

public class Main {
    public static void main(String[] args) {
        Graph myGraph = new Graph();
        myGraph.addVertex("AA");
        myGraph.addVertex("B");
        myGraph.addVertex("C");
        myGraph.addVertex("DD");

        myGraph.addEdge("AA", "B");
        myGraph.addEdge("AA", "C");
        myGraph.addEdge("B", "C");
        myGraph.addEdge("DD", "AA");

        System.out.println("\nPrint Graph");
        myGraph.printGraph();

        myGraph.removeEdge("AA", "B");

        System.out.println("\nGraph after removeEdge():");
        myGraph.printGraph();

        myGraph.removeVertex("DD");
        System.out.println("\nGraph after removeVertex():");
        myGraph.printGraph();
    }
}
