package java_codes.Tree;

class BST {


    class Node {
        int value;
        Node left;
        Node right;
        int height;

        Node(int value) {
            this.value = value;
        }
    }

    private Node root;


    public void insert(int value) {
        root = insert(value, root);
    }

    private Node insert(int value, Node node) {
        if (node == null) {
            return new Node(value);
        }

        if (value <= node.value) {
            node.left = insert(value, node.left);
        } else {
            node.right = insert(value, node.right);
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return node;
    }


    private int height(Node node) {
        if (node == null) return -1;
        return node.height;
    }


    public void populate(int[] nums) {
        for (int num : nums) {
            insert(num);
        }
    }


    public void populatedSorted(int[] nums) {
        populatedSorted(nums, 0, nums.length);
    }

    private void populatedSorted(int[] nums, int start, int end) {
        if (start >= end) return;

        int mid = (start + end) / 2;
        insert(nums[mid]);

        populatedSorted(nums, start, mid);
        populatedSorted(nums, mid + 1, end);
    }

    // Inorder traversal
    public void inorder() {
        inorder(root);
        System.out.println();
    }

    private void inorder(Node node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.value + " ");
        inorder(node.right);
    }

    // Main method
    public static void main(String[] args) {
        BST tree = new BST();

        int[] nums = {3, 5, 7, 10, 5};
        tree.populatedSorted(nums);

        System.out.print("Inorder traversal: ");
        tree.inorder();
    }
}

