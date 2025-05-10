import java.util.Arrays;

public class TreeArray {
	int tree[];
	int capacity, size = 0;
	public TreeArray(int capacity) {
		this.capacity = capacity;
		tree = new int[capacity];
	}
	public void insertNode(int val) {
		if(size == capacity) System.out.println("tree full");
		else tree[size++] = val;
	}
	public void inorderTraversal() {
		inorderTraversalRecursive(0);
	}
	public void inorderTraversalRecursive(int index) {
		if(index >= size) return;
		inorderTraversalRecursive(2*index+1);
		System.out.print(tree[index]+" -> ");
		inorderTraversalRecursive(2*index+2);
	}
	public void postorderTraversal() {
		postTraversalRecursive(0);
	}
	public void postTraversalRecursive(int index) {
		if(index >= size) return;
		postTraversalRecursive(2*index+1);
		postTraversalRecursive(2*index+2);
		System.out.print(tree[index]+" -> ");
	}
	public void preorderTraversal() {
		preTraversalRecursive(0);
	}
	public void preTraversalRecursive(int index) {
		if(index >= size) return;
		System.out.print(tree[index]+" -> ");
		preTraversalRecursive(2*index+1);
		preTraversalRecursive(2*index+2);
	}
	public boolean searchNode(int val) {
		if(size == 0) System.out.println("empty tree");
		return ((Arrays.binarySearch(tree, val)) != 1) ? true : false;
	}
	
	public static void main(String[] args) {
		TreeArray tree = new TreeArray(5);
		tree.insertNode(3);
		tree.insertNode(8);
		tree.insertNode(6);
		tree.insertNode(1);
		tree.insertNode(5);
		System.out.print("IN : ");
		tree.inorderTraversal();
		System.out.print("\n\nPRE : ");
		tree.preorderTraversal();
		System.out.print("\n\nPOST : ");
		tree.postorderTraversal();
		System.out.println("\n\nIs 5 present in tree: "+ tree.searchNode(5));
	}
}
