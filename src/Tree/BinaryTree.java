package Tree;

import java.util.Scanner;

public class BinaryTree {
    class Node {
        int value;
        Node left;
        Node right;

    }

    public void setRoot(Node root) {
        this.root = root;
    }

    private Node root;

    public Node getRoot() {
        return root;
    }
    Scanner sc = new Scanner(System.in);

    public BinaryTree() {
        root = createtree();
    }

    public Node createtree() {
        int item = sc.nextInt();
        Node nn = new Node();
        nn.value = item;
        boolean leftNode = sc.nextBoolean();
        if (leftNode) {
            nn.left = createtree();
        }
        boolean rightNode = sc.nextBoolean();
        if (rightNode) {
            nn.right = createtree();
        }
        return nn;
    }

    // For Display
    public void display() {
        display(root);
    }

    private void display(Node node) {
        if (node == null) { 
            return;
        }
        String s = "";
        s = "<--" + node.value + "-->";
        if (node.left != null) {
            s = node.left.value + s;
        } else {
            s = "." + s;
        }
        if (node.right != null) {
            s = s + node.right.value;
        } else {
            s = s + ".";
        }
        System.out.println(s);

        display(node.left);
        display(node.right);
    }
}
