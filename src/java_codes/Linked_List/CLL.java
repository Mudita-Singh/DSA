package java_codes.Linked_List;

public class CLL {

    private Node head;
    private Node tail;

    private class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public void insert(int val) {
        Node node = new Node(val);

        if (head == null) {
            head = node;
            tail = node;
            tail.next = head;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }

    // deletion
    public void delete(int val) {

        if (head == null) {
            return;
        }

        Node node = head;

        // delete from head
        if (node.val == val) {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                head = head.next;
                tail.next = head;
            }
            return;
        }

        // delete from middle or tail
        do {
            Node n = node.next;
            if (n.val == val) {
                node.next = n.next;

                if (n == tail) {
                    tail = node;
                }
                break;
            }
            node = node.next;
        } while (node != head);
    }

    public void display() {
        if (head == null) return;

        Node node = head;
        do {
            System.out.print(node.val);
            node = node.next;
        } while (node != head);


    }

    public static void main(String[] args) {
        CLL list = new CLL();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        list.display();

        list.delete(10);
        list.display();

        list.delete(30);
        list.display();

        list.delete(40);
        list.display();

        list.delete(20);
        list.display();
    }
}
