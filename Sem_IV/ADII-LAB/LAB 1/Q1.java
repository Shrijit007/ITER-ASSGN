import java.util.*;

public class Q1 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter number of vertex: ");
		int n = sc.nextInt();
		int matrix[][] = new int[n][n];
		System.out.println("Enter vertices with an edge: ");
		boolean choice = true;
		while(choice) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a == -1 && b == -1) break;
			addEdge(a-1, b-1, matrix);
		}
		System.out.println("Graph representated using Matrix: ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i] [j]+"  ");
			}
			System.out.println();
		}
	}
	
	public static void addEdge(int i, int j, int[][] matrix) {
		matrix[i][j]=1;
		matrix[j][i]=1;
	}
}



/*
Algorithm Steps:

1. **Start**
2. **Input** the number of vertices n
3. **Initialize** an n x n matrix with all elements set to 0.
4. **Repeat** until termination condition:
   - **Input** vertices a and b.
   - **If** a == -1 and b == -1, **break** the loop.
   - **Else**, set matrix[a-1][b-1] = 1 (assuming 1-based indexing for input).
5. **Print** the matrix.
 */