import java.util.*;

public class Q2 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		LinkedList<Integer>[] a = new LinkedList[n]; 
		for (int i = 0; i < n; i++) { 
	        a[i] = new LinkedList<Integer>(); 
	    }
		a[0].add(1);
		a[0].add(2);
		a[1].add(2);
		a[2].add(3);
	
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(i+" : "+a[i]);
		}
		
	}

}
/* 
Algorithm Steps:
Start
Input the number of vertices n.
Initialize an array a of n linked lists.
For each vertex i from 0 to n-1:
	Initialize a[i] as an empty linked list.
Input edges and update the adjacency list:
	For each edge (u, v), add v to the linked list at index u.
Print the adjacency list.
*/