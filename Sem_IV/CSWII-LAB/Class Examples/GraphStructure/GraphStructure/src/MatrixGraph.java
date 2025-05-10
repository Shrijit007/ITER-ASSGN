
public class MatrixGraph {
	private int[][] graph;
	public MatrixGraph(int n){
		graph  = new int[n][n];
	}
	public void insertEdge(int i,int j) {
		graph[i][j] = 1;
		graph[j][i] = 1;
	}
	public void displayGraph(){
		for (int i = 0; i < graph.length; i++) {
			System.out.println();
			if(i!=0) System.out.println("-----------------------------------------------------------------");
			for (int j = 0; j < graph.length; j++) {
				if(i==0 && j==0) {
					System.out.println("		"+"|"+"	"+"C0"+"	"+"|"+"	"+"C1"+"	"+"|"+"	"+"C2"+"	"+"|");
					System.out.println("-----------------------------------------------------------------");
				}
				if(j==0) System.out.print("	"+"R"+i+"	"+"|"+"	");
				 System.out.print(graph[i][j]+"	"+"|"+"	");
			}
		}
	}
	public static void main(String[] args) {
		MatrixGraph g = new MatrixGraph(3);
		g.insertEdge(0, 2);
		g.insertEdge(1, 0);
		g.insertEdge(2, 2);
		g.displayGraph();
	}
}
