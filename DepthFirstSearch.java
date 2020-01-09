import java.io.*; 
import java.util.LinkedList;

public class DepthFirstSearch {

    private int[] predecessor;
    private String[] colour;
    private int[] discoveryTime;
    private int[] finishTime;
    private int time;

    public dfs(Graph G) {
    
        // Initialize all the verticies in the graph to be white, and set the predecessor to null
        for (int i = 0, i < G.numOfV(), i++) {
            colour[i] = "white";
            predecessor[i] = null;
        }
        
        time = 0;
        
        for (int i = 0, i < G.numOfV(), i++) {
            
            // if the colour of the vertex is white, continue with a depth first search visit on that vertex
            if (colour[i].equals("white")) {
                dfs_visit(G, i);
            }
        }
    
    }
    
    public dfs_visit(Graph G, u) {
        time = time + 1;
        discoveryTime[u] = time;
        colour[u] = "grey";
        
        // Iterate through the neighbours of u
        LinkedList<Integer> neighbours = G.adjacencyListOf(u);
        
        while (neighbours.hasNext()) {
            Integer v_Integer = neighbours.next();
            int v = v_Integer.intValue();
            
            if (colour[v].equals("white")) {
                predecessor[v] = u;
                dfs.visit(G, v);
            }
            
            time = time + 1;
            colour[u] = "black";
            finishTime[u] = time;
        }
    
    }
}