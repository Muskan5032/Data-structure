import java.util.Scanner;

// Node class to represent each node in the linked list
class Node {
    int data;
    Node link;

    Node(int data) {
        this.data = data;
        this.link = null;
    }
}

// LinkedList class to handle operations on the linked list
class LinkedList {
    Node first;

    LinkedList() {
        this.first = null;
    }

    // Method to insert a new node at the beginning of the linked list
    void insert(int data) {
        Node newNode = new Node(data);
        if (first == null) {
            first = newNode;
        } else {
            newNode.link = first;
            first = newNode;
        }
    }

    // Method to reverse the linked list
    void reverse() {
        Node prev = null;
        Node current = first;
        Node link = null;

        while (current != null) {
            link = current.link;  // Store the link node
            current.link = prev;  // Reverse the current node's pointer
            prev = current;       // Move pointers one position ahead
            current = link;
        }

        first = prev;  // Update head to point to the new first node of the reversed list
    }

    // Method to print the linked list
    void display() {
        Node temp = first;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.link;
        }
        System.out.println();
    }
}


public class ReverseLinkedList{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();

        // Reading input numbers from the user
        System.out.println("Enter numbers to insert into linked list and enter a non-numeric value to stop:");
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            list.insert(n);
        }

        System.out.println("Original linked list:");
        list.display();

        list.reverse();

        System.out.println("Reversed linked list:");
        list.display();

    }
}
