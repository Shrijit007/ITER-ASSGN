package ASSGN6;

/*Design a class BSTNode in Java with a member variable value to store an integer and two references, left and right,
to represent its left and right children. Implement a constructor to initialize these attributes. Develop a method to
insert a node while maintaining the properties of a binary search tree. Extend this implementation by adding methods
for traversing the tree using pre-order, in-order, and post-order techniques. Finally, add a main method to create a
binary search tree, insert multiple nodes, and invoke the traversal methods to display the tree structure.*/

public class BinarySearchTreeQ1 {
    private BSTNode root;

    private BSTNode insertRec(BSTNode root, int value) {
        if (root == null) {
            return new BSTNode(value);
        }
        if (value < root.value) {
            root.left = insertRec(root.left, value);
        } else if (value > root.value) {
            root.right = insertRec(root.right, value);
        }
        return root;
    }

    public void insert(int value) {
        root = insertRec(root, value);
    }

    private void preOrder(BSTNode node) {
        if(node == null) return;
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(BSTNode node) {
        if(node == null) return;
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    private void postOrder(BSTNode node) {
        if(node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }

    public static void main(String[] args) {
        BinarySearchTreeQ1 bst = new BinarySearchTreeQ1();

        int[] values = {50, 30, 70, 20, 40, 60, 80};
        for (int value : values) {
            bst.insert(value);
        }
        System.out.println("Pre-order Traversal:");
        bst.preOrder(bst.root);
        System.out.println("\nIn-order Traversal:");
        bst.inOrder(bst.root);
        System.out.println("\nPost-order Traversal:");
        bst.postOrder(bst.root);
    }
}