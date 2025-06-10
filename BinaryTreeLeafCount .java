class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
        left = right = null;
    }
}

public class BinaryTreeLeafCount {
    Node root;
    int countLeafNodes(Node node) {
        if (node == null)
            return 0;
        if (node.left == null && node.right == null)
            return 1;
        return countLeafNodes(node.left) + countLeafNodes(node.right);
    }

    public static void main(String[] args) {
        BinaryTreeLeafCount tree = new BinaryTreeLeafCount();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        int leafCount = tree.countLeafNodes(tree.root);
        System.out.println("Number of leaf nodes in the binary tree: " + leafCount); 
    }
}

