import java.util.*;

public class Q3 {

    static void BFS(int start, LinkedList<Integer>[] a) {
        boolean visited[] = new boolean[a.length];
        LinkedList<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");
            for (int neighbor : a[node]) { 
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
    	int n=4;
        LinkedList<Integer>[] a = new LinkedList[n]; 
        for (int i = 0; i < n; i++) { 
            a[i] = new LinkedList<Integer>(); 
        }
        a[0].add(1);
        a[0].add(2);
        a[1].add(2);
        a[2].add(3);
        System.out.println("Breadth-First Search starting from vertex 0:");
        BFS(0, a);
    }
}
/* 
Algorithm Steps:
Start
Input the start vertex start and the adjacency list a.
Initialize a boolean array visited of size a.length to false.
Initialize an empty queue.
Mark visited[start] as true.
Enqueue start.
While the queue is not empty:
    Dequeue a vertex node.
    Print node.
    For each neighbor of node in a[node]:
        If neighbor is not visited:
            Mark visited[neighbor] as true.
            Enqueue neighbor.
End
*/