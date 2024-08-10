// Node class represents each node in the linked list
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// LinkedList class manages the linked list operations
class LinkedList {
    Node first;

    // Method to insert a new node at the beginning of the linked list
    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = first;
        first = newNode;
    }

    // Method to print the linked list
    void printList() {
        Node current = first;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Method to copy the linked list
    LinkedList copy() {
        LinkedList newList = new LinkedList();
        Node current = this.first;
        while (current != null) {
            newList.insertAtBeginning(current.data);
            current = current.next;
        }
          return newList.reverse();
    }
}

// Main class to test the LinkedList operations
public class CopyLinkedList{
    public static void main(String[] args) {
        LinkedList originalList = new LinkedList();
        originalList.insertAtBeginning(5);
        originalList.insertAtBeginning(4);
        originalList.insertAtBeginning(3);
        originalList.insertAtBeginning(2);
        originalList.insertAtBeginning(1);

        System.out.println("Original linked list:");
        originalList.printList();

        LinkedList copiedList = originalList.copy();

        System.out.println("Copied linked list:");
        copiedList.printList();
    }
}
