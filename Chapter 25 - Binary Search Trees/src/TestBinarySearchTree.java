public class TestBinarySearchTree {
    public static void main(String[] args) {
        // Create a BST
        BinarySearchTree<String> tree = new BinarySearchTree<>();
        tree.insert("George");
        tree.insert("Michael");
        tree.insert("Tom");
        tree.insert("Adam");
        tree.insert("Jones");
        tree.insert("Peter");
        tree.insert("Daniel");

        // Traverse tree
        System.out.print("Inorder (sorted): ");
        tree.inorder();
        System.out.print("\nPostorder: ");
        tree.postorder();
        System.out.print("\nPreorder: ");
        tree.preorder();
        System.out.println("\nThe number of nodes is " + tree.getSize());

        // Search for an element
        System.out.println("Is Peter in the tree? " + tree.search("Peter"));

        // Get a path from the root to Peter
        System.out.print("A path from the root to Peter is: ");
        java.util.ArrayList<TreeNode<String>> path = tree.path("Peter");
        for (int i = 0; path != null && i < path.size(); i++) {
            System.out.print(path.get(i).element + " ");
        }

        Integer[] numbers = {2, 4, 3, 1, 8, 5, 6, 7};
        BinarySearchTree<Integer> intTree = new BinarySearchTree<>(numbers);
        System.out.print("\nInorder (sorted): ");
        intTree.inorder();
    }
}
