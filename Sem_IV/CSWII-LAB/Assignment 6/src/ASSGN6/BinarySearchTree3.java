package ASSGN6;
/*Implement a method to remove node x from a binary search tree while ensuring that the tree maintains its
properties.The deletion process involves three cases:
1.Case 1: Node x has no children (a leaf node).
2.Case 2: Node x has one child (either left or right).
3.Case 3: Node x has two children, requiring a suitable replacement to maintain the BST structure.*/

public class BinarySearchTree3 {
    private BSTNode root;

    public BinarySearchTree3() {
        root = null;
    }
    
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


    public void delete(int value) {
        root = deleteRec(root, value);
    }

    private BSTNode deleteRec(BSTNode root, int value) {
        if (root == null) {
            return null;
        }

        if (value < root.value) {
            root.left = deleteRec(root.left, value);
        } else if (value > root.value) {
            root.right = deleteRec(root.right, value);
        } else {
            // Case 1: No child
            if (root.left == null && root.right == null) return null;

            // Case 2: One child
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            // Case 3: Two children
            BSTNode successor = findMin(root.right);
            root.value = successor.value;
            root.right = deleteRec(root.right, successor.value);
        }
        return root;
    }

    private BSTNode findMin(BSTNode node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    public static void inOrder(BSTNode node) {
        if(node == null) return;
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    public static void main(String[] args) {
        BinarySearchTree3 bst = new BinarySearchTree3();
        int[] values = {50, 30, 70, 20, 40, 60, 80};
        for (int value : values) {
            bst.insert(value);
        }
        System.out.println("Initial BST (in-order):");
        inOrder(bst.root);
        bst.delete(20); // Case 1: Leaf node
        bst.delete(30); // Case 2: One child
        bst.delete(50); // Case 3: Two children
        System.out.println("\nBST after deleting 50 (in-order):");
        inOrder(bst.root);
    }
}
