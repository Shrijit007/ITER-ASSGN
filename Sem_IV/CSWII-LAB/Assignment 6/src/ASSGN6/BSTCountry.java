package ASSGN6;
/*Design a Java program to manage country data using a binary search tree (BST). Create a class Country with
members for name and population, along with a constructor and necessary methods. Define a class BNode to store a
Country object and maintain references to its left and right children. Implement a class BSTCountry with a root node,
a constructor, and a method to insert countries into the tree based on their population. Extend the BST by adding
methods for in-order traversal, finding the country with the maximum population (findMax), and finding the country
with the minimum population (findMin). Finally, develop a main method to create a BST, insert country nodes, and
invoke these methods to display the results.*/

class Country {
    private String name;
    int population;

    public Country(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public String toString() {
        return name + " (Population: " + population + ")";
    }
}

class BNode {
    Country data;
    BNode left, right;

    public BNode(Country data) {
        this.data = data;
        left = right = null;
    }
}

public class BSTCountry {
    private BNode root;

    public BSTCountry() {
        root = null;
    }

    public void insert(Country country) {
        root = insertRec(root, country);
    }

    private BNode insertRec(BNode root, Country country) {
        if (root == null) {
            return new BNode(country);
        }
        if (country.population < root.data.population) {
            root.left = insertRec(root.left, country);
        } else if (country.population > root.data.population) {
            root.right = insertRec(root.right, country);
        }
        return root;
    }

    private void inOrder(BNode node) {
       if(node == null) return;
            inOrder(node.left);
            System.out.print(node.data + " | ");
            inOrder(node.right);
    }

    public Country findMax() {
        if (root == null) return null;
        BNode current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.data;
    }

    public Country findMin() {
        if (root == null) return null;
        BNode current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.data;
    }

    public static void main(String[] args) {
        BSTCountry bst = new BSTCountry();

        bst.insert(new Country("India", 14000));
        bst.insert(new Country("USA", 3310));
        bst.insert(new Country("China", 14410));
        bst.insert(new Country("Germany", 830));
        bst.inOrder(bst.root);
        System.out.println("\nCountry with Maximum Population: " + bst.findMax());
        System.out.println("Country with Minimum Population: " + bst.findMin());
    }
}
