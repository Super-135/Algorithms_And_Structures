package Lesson7;

public class Main {
    public static void main(String[] args) {

        Graph graph = new Graph(10);

        graph.addEdge(1,2);
        graph.addEdge(0,4);
        graph.addEdge(1,4);
        graph.addEdge(3,4);
        graph.addEdge(5,2);
        graph.addEdge(6,3);
        graph.addEdge(7,5);
        graph.addEdge(8,6);
        graph.addEdge(9,7);


        BreadthFirstPath bfp = new BreadthFirstPath(graph, 9);
        System.out.println(bfp.pathTo(0));
  
    }
}
