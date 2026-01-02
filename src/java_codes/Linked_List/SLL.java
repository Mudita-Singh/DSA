package java_codes.Linked_List;

public class SLL {

    private Node head;
    private Node tail;
    private int size;

    private class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
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
        tail = node;
        size++;
    }

    public void insertAtIndex(int val, int index) {
        if (index < 0 || index > size){
            return;
        }

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
        temp.next = node;
        size++;
    }

    public int deleteFirst() {
        if (head == null) return -1;
        int val = head.val;
        head = head.next;
        if (head == null) tail = null;
        size--;
        return val;
    }

    public int deleteLast() {
        if (size <= 1) return deleteFirst();

        Node temp = head;
        while (temp.next != tail) temp = temp.next;

        int val = tail.val;
        tail = temp;
        tail.next = null;
        size--;
        return val;
    }

    public int deleteAtIndex(int index) {
        if (index < 0 || index >= size) return -1;

        if (index == 0) return deleteFirst();
        if (index == size - 1) return deleteLast();

        Node temp = head;
        for (int i = 1; i < index; i++) temp = temp.next;

        int val = temp.next.val;
        temp.next = temp.next.next;
        size--;
        return val;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val);
            temp = temp.next;
        }

    }

    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertFirst(10);
        list.insertLast(20);
        list.insertLast(30);
        list.insertAtIndex(25, 2);
        list.display();
        list.deleteAtIndex(2);
        list.display();
    }
}
