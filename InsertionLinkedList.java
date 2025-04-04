class Node{
    int data;
    Node next;
    Node (int data){
        this.data = data;
        this.next = null;
    }
}
public class InsertionLinkedList {
    Node head;
    InsertionLinkedList(){
        head = null;
    }
    public void insertAtBeginin(int data){
        Node newNode = new Node(data);
        newNode.next = this.head;
        this.head = newNode;
    }
    // Function to print the linked list
    public void printList(){
        Node current = this.head;
        while (current != null) {
            System.out.println(current.data+" ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        InsertionLinkedList list=new InsertionLinkedList();
        list.insertAtBeginin(10);
        list.insertAtBeginin(20);
        list.insertAtBeginin(30);
        list.insertAtBeginin(40);

        list.printList();
    }

}
