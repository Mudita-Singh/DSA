package java_codes.Tree;

import java.util.Scanner;

class BinaryTree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    private Node root;

    // Building tree using Scanner
    public void populate(Scanner sc) {
        System.out.print("Enter root value: ");
        int value = sc.nextInt();
        root = new Node(value);
        populate(sc, root);
    }

    private void populate(Scanner sc, Node node) {
        System.out.print("Do you want to enter left of " + node.data + " (true/false): ");
        boolean left = sc.nextBoolean();
        if (left) {
            System.out.print("Enter value: ");
            int value = sc.nextInt();
            node.left = new Node(value);
            populate(sc, node.left);
        }

        System.out.print("Do you want to enter right of " + node.data + " (true/false): ");
        boolean right = sc.nextBoolean();
        if (right) {
            System.out.print("Enter value: ");
            int value = sc.nextInt();
            node.right = new Node(value);
            populate(sc, node.right);
        }
    }

    // Traversals
    public void preorder() {
        preorder(root);
        System.out.println();
    }

    private void preorder(Node node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    public void inorder() {
        inorder(root);
        System.out.println();
    }

    private void inorder(Node node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    public void postorder() {
        postorder(root);
        System.out.println();
    }

    private void postorder(Node node) {
        if (node == null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();

        tree.populate(sc);

        System.out.print("Preorder: ");
        tree.preorder();

        System.out.print("Inorder: ");
        tree.inorder();

        System.out.print("Postorder: ");
        tree.postorder();
    }
}

