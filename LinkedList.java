public class LinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Implementation of Insertion at the end of the linked list
    public void insertion(int newData) {

        Node newNode = new Node(newData);
        // If linked list is empty
        if (head == null) {
            head = new Node(newData);
            return;
        }
        // If linked list is not empty
        newNode.next = null;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Program to Display linked list
    public void displayLL() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + ",");
            current = current.next;
        }
    }

    // Insertion at the begining of the linked list
    public void insertionAtBeg(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;

    }

    // Insertion of node after any node
    public void insertAfter(Node prev_node, int newData) {
        if (prev_node == null) {
            System.out.println("The previous node cannot contain null valaue");
            return;
        }
        Node newNode = new Node(newData);
        newNode.next = prev_node.next;
        prev_node.next = newNode;
    }

    // Delete of the node from the linked list
    public void deletion(int position) {
        // if linked list is empty
        if (head == null) {
            return;
        }

        Node temp = head;
        // Deletion is in the begning of the node
        if (position == 0) {
            head = temp.next;
            return;
        }

        // deletion is not in the begining of the node
        for (int i = 0; temp != null && i < position - 1; i++) {
            temp = temp.next; // incresing temp value
        }
        // once task is done aisa to nahi hai ki ham emty node se tkara gaye ho
        if (temp == null || temp.next == null) {
            return;
        }
        // agr aisa nahi hai to temp ke next me value daal do
        temp.next = temp.next.next;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertion(12);
        ll.insertion(14);
        ll.insertion(15);
        ll.insertion(16);
        ll.insertAfter(null, 0);
        ll.insertion(17);
        ll.insertion(18);
        ll.insertionAtBeg(10);
        ll.insertionAtBeg(5);
        ll.insertAfter(ll.head.next.next, 100);

        System.out.println("Printing the linked list ");
        ll.displayLL();
        System.out.println("After deletion of the node ");
        ll.deletion(3);
        ll.displayLL();
    }
}