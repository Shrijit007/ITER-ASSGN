package ASSGN6;
/*Construct a binary search tree from the given array of elements: {10, 20, 30, 40, 50, 60, 70, 80, 90, 100}.
Include a method called CreateTree to construct the binary search tree from a sorted array. This method takes an
array of integers as input and constructs the tree recursively using a binary search algorithm.*/


public class BinarySearchTreeQ2 {
    public static BSTNode CreateTree(int[] arr, int start, int end) {
        if (start > end) 
            return null;
        int mid = (start + end) / 2;
        BSTNode root = new BSTNode(arr[mid]);
        root.left = CreateTree(arr, start, mid - 1); // Left subtree
        root.right = CreateTree(arr, mid + 1, end);  // Right subtree
        return root;
    }

    public static void inOrder(BSTNode node) {
        if(node == null) return;
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        BSTNode bstRoot = CreateTree(arr, 0, arr.length - 1);

        System.out.println("Inorder Traversal of BST:");
        inOrder(bstRoot);
    }
}

