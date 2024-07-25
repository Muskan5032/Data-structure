import java.util.Scanner;

class Node {
    int info;
    Node lpter;
    Node rpter;

    Node(int data) {
        this.info = data;
        this.lpter = null;
        this.rpter = null;
    }
}

class DoublyLinkedListDemo {
    Node head;
    Node tail;

    public void DLL_INS_FIRST(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            temp.rpter = head;
            head.lpter = temp;
            head = temp;
        }
    }

    public void DLL_INS_LAST(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            tail.rpter = temp;
            temp.lpter = tail;
            tail = temp;
        }
    }

    public void DLL_DELETE(int x) {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }

        Node current = head;
        while (current != null && current.info != x) {
            current = current.rpter;
        }

        if (current == null) {
            System.out.println("Element " + x + " not found in the list.");
            return;
        }

        if (current == head && current == tail) {
            head = null;
            tail = null;
        } else if (current == head) {
            head = head.rpter;
            head.lpter = null;
        } else if (current == tail) {
            tail = tail.lpter;
            tail.rpter = null;
        } else {
            current.lpter.rpter = current.rpter;
            current.rpter.lpter = current.lpter;
        }
    }

    public void DLL_DISPLAY() {
        if (head == null) {
            System.out.println("Doubly Linked List is empty.");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.info + " -> ");
            current = current.rpter;
        }
        System.out.println("null");
    }
}

public class ImplementDoublyLinkedList{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoublyLinkedListDemo list = new DoublyLinkedListDemo();
        boolean istrue = true;

        while (istrue) {
            System.out.println("ENTER YOUR CHOICE:");
            System.out.println("1. DLL_INS_FIRST");
            System.out.println("2. DLL_INS_LAST");
            System.out.println("3. DLL_DELETE");
            System.out.println("4. DLL_DISPLAY");
            System.out.println("5. EXIT");

            int choice = sc.nextInt();
            int val;

            switch (choice) {
                case 1:
                    System.out.println("Enter number to insert at first in DoublyLinkedList:");
                    val = sc.nextInt();
                    list.DLL_INS_FIRST(val);
                    break;

                case 2:
                    System.out.println("Enter number to insert at last in DoublyLinkedList:");
                    val = sc.nextInt();
                    list.DLL_INS_LAST(val);
                    break;

                case 3:
                    System.out.println("Enter number to delete from DoublyLinkedList:");
                    val = sc.nextInt();
                    list.DLL_DELETE(val);
                    break;

                case 4:
                    list.DLL_DISPLAY();
                    break;

                case 5:
                    istrue = false;
                    break;

            }
        }
    }
}
