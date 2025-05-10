package ASSGN6;
/*Determine if a given binary tree is a binary search tree. You will use an isBST method, which takes the maximum
and minimum range of the values of the nodes.*/

public class ValidateBSTQ3 {
    public static boolean isBST(BSTNode node, Integer min, Integer max) {
        if (node == null) {
            return true;
        }
        if ((min != null && node.value <= min) || (max != null && node.value >= max)) {
            return false;
        }
        return isBST(node.left, min, node.value) && isBST(node.right, node.value, max);
    }

    public static void main(String[] args) {

        BSTNode root = new BSTNode(50);
        root.left = new BSTNode(30);
        root.right = new BSTNode(70);
        root.left.left = new BSTNode(20);
        root.left.right = new BSTNode(40);
        root.right.left = new BSTNode(60);
        root.right.right = new BSTNode(80);

        if (isBST(root, null, null)) {
            System.out.println("The given tree is a Binary Search Tree.");
        } else {
            System.out.println("The given tree is NOT a Binary Search Tree.");
        }
    }
}
