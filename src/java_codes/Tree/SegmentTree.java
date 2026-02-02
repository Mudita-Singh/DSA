package java_codes.Tree;

class SegmentTree {

    private static class Node {
        int data;
        int startInterval;
        int endInterval;
        Node left;
        Node right;

        Node(int startInterval, int endInterval) {
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
    }

    Node root;

    // constructor
    SegmentTree(int[] arr) {
        root = constructTree(arr, 0, arr.length - 1);
    }

    // build tree
    private Node constructTree(int[] arr, int start, int end) {
        if (start == end) {
            Node leaf = new Node(start, end);
            leaf.data = arr[start];
            return leaf;
        }

        Node node = new Node(start, end);
        int mid = (start + end) / 2;

        node.left = constructTree(arr, start, mid);
        node.right = constructTree(arr, mid + 1, end);

        node.data = node.left.data + node.right.data;
        return node;
    }

    // Display

    public void display() {
        display(root);
    }

    private void display(Node node) {
        if (node == null) return;

        System.out.println(
                "[" + node.startInterval + ", " + node.endInterval + "] -> " + node.data
        );

        display(node.left);
        display(node.right);
    }

    // Query

    public int query(int qsi, int qei) {
        return query(root, qsi, qei);
    }

    private int query(Node node, int qsi, int qei) {
        // complete overlap
        if (node.startInterval >= qsi && node.endInterval <= qei) {
            return node.data;
        }

        // no overlap
        if (node.endInterval < qsi || node.startInterval > qei) {
            return 0;
        }

        // partial overlap
        return query(node.left, qsi, qei)
                + query(node.right, qsi, qei);
    }

    // Update

    public void update(int index, int value) {
        update(root, index, value);
    }

    private int update(Node node, int index, int value) {
        if (index < node.startInterval || index > node.endInterval) {
            return node.data;
        }

        if (node.startInterval == node.endInterval) {
            node.data = value;
            return node.data;
        }

        int leftAns = update(node.left, index, value);
        int rightAns = update(node.right, index, value);

        node.data = leftAns + rightAns;
        return node.data;
    }

    public static void main(String[] args) {
        int[] arr = {3, 8, 6, 7, -2, -8, 4, 9};
        SegmentTree tree = new SegmentTree(arr);
        tree.display();

        System.out.println(tree.query(1, 6));
    }
}
