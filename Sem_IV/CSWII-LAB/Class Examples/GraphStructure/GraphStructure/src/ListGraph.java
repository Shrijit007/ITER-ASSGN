import java.util.ArrayList;
import java.util.List;

public class ListGraph {

	public static void main(String[] args) {
		int v=6;
		List<List<Integer>> adj=new ArrayList<>();
		for(int i=0;i<v;i++) {
			adj.add(new ArrayList<>());
			addEdge(adj,0,1);
			addEdge(adj,0,4);
			addEdge(adj,0,5);
			addEdge(adj,1,2);
			addEdge(adj,1,3);
			addEdge(adj,3,4);
			addEdge(adj,4,5);
			display(adj);
			
		}

	}
	public static void addEdge(List<List<Integer>> adj,int i,int j) {
		adj.get(i).add(j);
		adj.get(j).add(i);
	}
	public static void display(List<List<Integer>> adj) {
		for(int i=0;i<6;i++) {
			System.out.print(i+" ");
			for(int j:adj.get(i)) {
				System.out.print(j);
			}
		}
	}

}
