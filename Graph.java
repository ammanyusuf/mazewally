import java.io.*; 
import java.util.LinkedList;

public class Graph {
    
    private int verticies;
    
    private LinkedList<Integer> adjacencyList[];
    
    
    // Constructor
    public Graph(int vertex_num) {
        verticies = vertex_num;
        
        // Creade an empty adjacency list for each vertex in the graph
        for (int i = 0; i < vertex_num; i++) {
        
            adjacencyList[i] = new LinkedList();
        
        }
    }

    public int numOfV() {
        return verticies;
    }
    
    public LinkedList<Integer> adjacencyListOf(int u) {
        return adjacencyList[u];
    }
    
    // Methods
    
    /**
    * The add path method adds an path between two input verticies
    * @param int a: one of the verticies that we want to add an path to
    * @param int b: one of the verticies that we want to add an path to
    */
    public void addPath(int a, int b) {
        
        if (adjacencyList[a].contains(b) || adjacencyList[b].contains(a)) {
            System.out.println("Path already exists between vertex " + a + " and vertex " + b);
        } else {
            adjacencyList[a].add(b);    // Add b to a's adjacency list
            adjacencyList[b].add(a);    // Add a to b's adjacency list
        }
    }        
    
    /**
    * The remove path method removes an path between two input verticies
    * @param int a: one of the verticies that we want to remove an path
    * @param int b: one of the verticies that we want to remove an path
    */
    public void removePath(int a, int b) {
        
        if (adjacencyList[a].contains(b) && adjacencyList[b].contains(a)) {
            adjacencyList[a].remove(b);    // Remove b to a's adjacency list
            adjacencyList[b].remove(a);    // Remove a to b's adjacency list
        } else {
            System.out.println("There is no edge between vertex " + a + " and vertex " + b);
        }
    
    }        
    
}
