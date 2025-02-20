import java.util.*;

public class Q5 {
    static int V;

    static class Edge implements Comparable<Edge> {
        int src, dest, weight;

        Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }

        public int compareTo(Edge other) {
            return this.weight - other.weight;
        }
    }

    static int findParent(int[] parent, int node) {
        if (parent[node] == node) return node;
        return parent[node] = findParent(parent, parent[node]);
    }

    static void union(int[] parent, int[] rank, int u, int v) {
        int rootU = findParent(parent, u);
        int rootV = findParent(parent, v);
        
        if (rootU != rootV) {
            if (rank[rootU] < rank[rootV]) {
                parent[rootU] = rootV;
            } else if (rank[rootU] > rank[rootV]) {
                parent[rootV] = rootU;
            } else {
                parent[rootV] = rootU;
                rank[rootU]++;
            }
        }
    }

    public static void kruskalMST(int[][] graph) {
        V = graph.length;
        List<Edge> edges = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            for (int j = i + 1; j < V; j++) {
                if (graph[i][j] > 0) {
                    edges.add(new Edge(i, j, graph[i][j]));
                }
            }
        }

        Collections.sort(edges);
        int[] parent = new int[V];
        int[] rank = new int[V];
        for (int i = 0; i < V; i++) {
            parent[i] = i;
            rank[i] = 0;
        }

        System.out.println("Edges in MST:");
        int count = 0;
        for (Edge edge : edges) {
            if (count == V - 1) break;
            int u = findParent(parent, edge.src);
            int v = findParent(parent, edge.dest);

            if (u != v) {
                System.out.println(edge.src + " - " + edge.dest + " : " + edge.weight);
                union(parent, rank, u, v);
                count++;
            }
        }
    }

    public static void main(String[] args) {
        int[][] graph = {
            {0, 2, 0, 6, 0},
            {2, 0, 3, 8, 5},
            {0, 3, 0, 0, 7},
            {6, 8, 0, 0, 9},
            {0, 5, 7, 9, 0}
        };

        kruskalMST(graph);
    }
}



// 1. **Initialize**:
//    - Create a list of all edges in the graph.
//    - Sort all the edges in non-decreasing order of their weight.
//    - Create an array `subsets` to keep track of the subsets of vertices.

// 2. **Construct MST**:
//    - Initialize an empty result array to store the edges of the MST.
//    - For each edge in the sorted list:
//      - Find the root of the sets to which the two vertices of the edge belong.
//      - If the roots are different, add the edge to the result and union the two sets.
//      - If the roots are the same, discard the edge to avoid a cycle.

// 3. **Print MST**:
//    - Print the edges and weights of the MST.
