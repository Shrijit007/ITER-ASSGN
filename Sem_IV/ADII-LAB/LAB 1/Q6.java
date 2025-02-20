import java.util.*;

public class Q6 {

    public static void primsAlgorithm(int[][] graph) {
        int vertices = graph.length;
        int[] parent = new int[vertices];
        int[] key = new int[vertices];
        boolean[] mstSet = new boolean[vertices];

        Arrays.fill(key, Integer.MAX_VALUE);
        key[0] = 0;
        parent[0] = -1;

        for (int count = 0; count < vertices - 1; count++) {
            int u = minKey(key, mstSet);
            mstSet[u] = true;

            for (int v = 0; v < vertices; v++) {
                if (graph[u][v] != 0 && !mstSet[v] && graph[u][v] < key[v]) {
                    parent[v] = u;
                    key[v] = graph[u][v];
                }
            }
        }

        printMST(parent, graph);
    }

    private static int minKey(int[] key, boolean[] mstSet) {
        int min = Integer.MAX_VALUE, minIndex = -1;

        for (int v = 0; v < key.length; v++) {
            if (!mstSet[v] && key[v] < min) {
                min = key[v];
                minIndex = v;
            }
        }

        return minIndex;
    }

    private static void printMST(int[] parent, int[][] graph) {
        System.out.println("Edge \tWeight");
        for (int i = 1; i < graph.length; i++) {
            System.out.println(parent[i] + " - " + i + "\t" + graph[i][parent[i]]);
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

        primsAlgorithm(graph);
    }
}


// 1. **Initialize**:
//    - Create arrays `key[]`, `parent[]`, and `mstSet[]`.
//    - Set all values in `key[]` to infinity and `mstSet[]` to false.
//    - Set `key[0]` to 0 and `parent[0]` to -1.

// 2. **Construct MST**:
//    - Repeat for `vertices - 1` times:
//      - Pick the minimum key vertex `u` from the set of vertices not yet included in MST.
//      - Include `u` in `mstSet`.
//      - Update `key[]` and `parent[]` for the adjacent vertices of `u`:
//        - For each adjacent vertex `v`, if `graph[u][v]` is smaller than `key[v]` and `v` is not in `mstSet`, update `key[v]` and `parent[v]`.

// 3. **Print MST**:
//    - Print the edges and weights of the MST using the `parent[]` array.
