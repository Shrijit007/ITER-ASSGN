import java.util.LinkedList;

public class Q4 {

    static void DFS(int start, LinkedList<Integer>[] a) {
        boolean visited[] = new boolean[a.length];
        LinkedList<Integer> stack = new LinkedList<>();
        stack.push(start);
        while (!stack.isEmpty()) {
            int node = stack.pop();
            if (!visited[node]) {
                System.out.print(node+" ");
                visited[node] = true;
            }
            for (int neighbor : a[node]) {
                if (!visited[neighbor]) {
                    stack.push(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        int n = 4;
        LinkedList<Integer>[] a = new LinkedList[n]; 
        for (int i = 0; i < n; i++) { 
            a[i] = new LinkedList<Integer>(); 
        }
        a[0].add(1);
        a[0].add(2);
        a[1].add(2);
        a[2].add(3);

        System.out.println("Depth-First Search starting from vertex 0:");
        DFS(0, a);
    }
}

/*
Algorithm Steps:
Start
Input the start vertex start and the adjacency list a.
Initialize a boolean array visited of size a.length to false.
Initialize an empty stack.
Push start onto the stack.
While the stack is not empty:
    Pop a vertex node from the stack.
    If node is not visited:
        Mark visited[node] as true.
        Print node.
    For each neighbor of node in a[node]:
        If neighbor is not visited:
            Push neighbor onto the stack.
End

 */