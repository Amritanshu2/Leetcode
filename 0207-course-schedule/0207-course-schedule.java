import java.util.*;

class Solution {
    
    // Define the edge class to represent an edge in the graph
    public class Edge {
        int val;
        int nbr;
        
        public Edge(int val, int nbr) {
            this.val = val;
            this.nbr = nbr;
        }
    }
    
    // Use instance variables instead of global variables
    private HashSet<Integer> visited;
    private HashSet<Integer> done;

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<Edge>[] adjacencyList = new ArrayList[numCourses];
        visited = new HashSet<>();
        done = new HashSet<>();
        
        
        for (int i = 0; i < numCourses; i++) {
            adjacencyList[i] = new ArrayList<>();
        }
        
        for (int[] prerequisite : prerequisites) {
            adjacencyList[prerequisite[0]].add(new Edge(prerequisite[0], prerequisite[1]));
        }
        
        for (int i = 0; i < numCourses; i++) {
            if (!done.contains(i) && !dfs(i, adjacencyList)) {
                return false;
            }
        }
        
        return true;
    }
    
    private boolean dfs(int course, List<Edge>[] adjacencyList) {
        if (visited.contains(course)) {
            return false; 
        }
        
        visited.add(course);
        
        for (Edge edge : adjacencyList[course]) {
            if (!done.contains(edge.nbr) && !dfs(edge.nbr, adjacencyList)) {
                return false;
            }
        }
        
        visited.remove(course);
        done.add(course);
        
        return true;
    }
}
