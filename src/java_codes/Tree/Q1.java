package java_codes.Tree;

import java.util.LinkedList;
import java.util.Queue;

//google question
// find level order successor

public class Q1 {

    // Tree node class
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    // Method to find level order successor
    public static TreeNode findSuccessor(TreeNode root, int key) {
        if (root == null) return null;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode currentNode = queue.poll();

            if (currentNode.left != null) {
                queue.offer(currentNode.left);
            }

            if (currentNode.right != null) {
                queue.offer(currentNode.right);
            }

            if (currentNode.val == key) {
                return queue.peek();   // level order successor
            }
        }
        return null;
    }

    // Main method
    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        int key = 3;
        TreeNode result = findSuccessor(root, key);

        if (result != null) {
            System.out.println("Successor of " + key + " is: " + result.val);
        } else {
            System.out.println("No successor found");
        }
    }
}
