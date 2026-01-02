package java_codes.Linked_List;

public class DLL {

    private Node head;
    private Node tail;
    private int size;

    private class Node {
        int val;
        Node next;
        Node prev;

        Node(int val) {
            this.val = val;
        }
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        if (head != null) head.prev = node;
        head = node;
        if (tail == null) tail = head;
        size++;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        node.prev = tail;
        tail = node;
        size++;
    }

    public void insertAtIndex(int val, int index) {
        if (index < 0 || index > size) return;

        if (index == 0) {
            insertFirst(val);
            return;
        }

        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) temp = temp.next;

        Node node = new Node(val);
        node.next = temp.next;
        node.prev = temp;
        temp.next.prev = node;
        temp.next = node;
        size++;
    }

    public int deleteFirst() {
        if (head == null) return -1;

        int val = head.val;
        head = head.next;

        if (head != null) head.prev = null;
        else tail = null;

        size--;
        return val;
    }

    public int deleteLast() {
        if (tail == null) return -1;

        int val = tail.val;
        tail = tail.prev;

        if (tail != null) tail.next = null;
        else head = null;

        size--;
        return val;
    }

    public int deleteAtIndex(int index) {
        if (index < 0 || index >= size) return -1;

        if (index == 0) return deleteFirst();
        if (index == size - 1) return deleteLast();

        Node temp = head;
        for (int i = 0; i < index; i++) temp = temp.next;

        int val = temp.val;
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
        size--;
        return val;
    }

    public void displayForward() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val);
            temp = temp.next;
        }

    }

    public void displayBackward() {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.val);
            temp = temp.prev;
        }

    }

    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(10);
        list.insertLast(20);
        list.insertLast(30);
        list.insertAtIndex(25, 2);
        list.displayForward();
        list.displayBackward();
        list.deleteAtIndex(2);
        list.displayForward();
    }
}
