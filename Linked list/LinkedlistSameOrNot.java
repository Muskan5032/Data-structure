import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    Node head;

    // Method to insert a node at the end of the linked list
    public void insertAtLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Method to count the number of nodes in the linked list
    public int countNode() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}

public class LinkedlistSameOrNot {

    public static boolean checkLinkedLists(SinglyLinkedList ll1, SinglyLinkedList ll2) {
        if (ll1.head == null && ll2.head == null) {
            return true;
        }

        if (ll1.head == null || ll2.head == null) {
            return false;
        }

        int size1 = ll1.countNode();
        int size2 = ll2.countNode();

        if (size1 != size2) {
            return false;
        }

        Node temp1 = ll1.head;
        Node temp2 = ll2.head;

        while (temp1 != null && temp2 != null) {
            if (temp1.data != temp2.data) {
                return false;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SinglyLinkedList ll1 = new SinglyLinkedList();
        SinglyLinkedList ll2 = new SinglyLinkedList();

        System.out.println("Enter elements of first linked list (enter -1 to stop):");
        int x;
        while (true) {
            x = sc.nextInt();
            if (x == -1) break;
            ll1.insertAtLast(x);
        }

        System.out.println("Enter elements of second linked list (enter -1 to stop):");
        while (true) {
            x = sc.nextInt();
            if (x == -1) break;
            ll2.insertAtLast(x);
        }

        if (checkLinkedLists(ll1, ll2)) {
            System.out.println("Both Linked Lists are the same.");
        } else {
            System.out.println("Both Linked Lists are not the same.");
        }

        sc.close();
    }
}
