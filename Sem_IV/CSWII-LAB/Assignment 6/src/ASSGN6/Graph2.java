package ASSGN6;
/*Create a class Graph that uses a linked list to represent N vertices. Implement a constructor to initialize the
graph. Add a method to read a graph and store it using an adjacency list representation. Additionally, implement a
Depth-First Search (DFS) method to traverse the graph's vertices. Finally, include a main method to create a graph,
invoke the implemented methods, and display the traversal results.*/

import java.util.*;

public class Graph2 {
    private int vertices;
    private LinkedList<Integer>[] adjList;

    public Graph2(int vertices) {
        this.vertices = vertices;
        adjList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int src, int dest) {
        adjList[src].add(dest);
        adjList[dest].add(src);
    }

    public void DFS(int startVertex) {
        boolean[] visited = new boolean[vertices];
        System.out.print("Depth-First Search Traversal: ");
        DFSUtil(startVertex, visited);
    }

    private void DFSUtil(int vertex, boolean[] visited) {
        visited[vertex] = true;
        System.out.print(vertex + " ");
        for (int neighbor : adjList[vertex]) {
            if (!visited[neighbor]) {
                DFSUtil(neighbor, visited);
            }
        }
    }


    public static void main(String[] args) {
        Graph2 graph = new Graph2(5);

        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        graph.DFS(0);
    }
}
