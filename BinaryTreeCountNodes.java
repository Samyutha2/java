class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
        left = right = null;
    }
}

public class BinaryTreeCountNodes {
    Node root;
    int countNodes(Node node) {
        if (node == null)
            return 0;
        return 1 + countNodes(node.left) + countNodes(node.right);
    }

    public static void main(String[] args) {
        BinaryTreeCountNodes tree = new BinaryTreeCountNodes();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        int totalNodes = tree.countNodes(tree.root);
        System.out.println("Total number of nodes in the binary tree: " + totalNodes);  
    }
}
