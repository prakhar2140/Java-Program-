class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class InsertionAtEndLinkedList {
    Node head;

    InsertionAtEndLinkedList() {
        head = null;
    }

    public void insertionAtEnd(int data) {
        Node newnode = new Node(data);
        Node current = this.head;
        if (head == null) {
            head = newnode;
            return;
        }
        while (current.next != null) {
            current = current.next;
        }
        current.next = newnode;

    }

    public void printList() {
        Node current = this.head;
        while (current != null) {
            System.out.println(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        InsertionAtEndLinkedList list = new InsertionAtEndLinkedList();
        list.insertionAtEnd(10);
        list.insertionAtEnd(20);
        list.insertionAtEnd(30);
        list.insertionAtEnd(40);
        list.printList();
    }

}
