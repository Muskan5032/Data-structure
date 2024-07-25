import java.util.Scanner;

class Node {
    int data;
    Node link; 

    Node(int data) {
        this.data = data;
        this.link = null;
    }
}
class CirculerLinkedList {
    Node first;
    Node last;

    public void CIR_INS_FIRST(int data) {
        Node newNode = new Node(data);
        if (first == null) {
            newNode.link = newNode;
            first = newNode;
            last = newNode;
        } else {
            newNode.link = first;
            last.link = newNode;
            first = newNode;
        }
    }

    public void CIR_INS_LAST(int data) {
        Node newNode = new Node(data);
        if (first == null) {
            newNode.link = newNode;
            first = newNode;
            last = newNode;
        } else {
            newNode.link = first;
            last.link = newNode;
            last = newNode;
        }
    }

    public void CIR_DELETE(int x) {
        if (first == null) {
            System.out.println("Linked list is empty");
            return;
        }

        Node save = first;
        Node pred = null;

        do {
            if (save.data == x) {
                break;
            }
            pred = save;
            save = save.link;
        } while (save != first);

        if (save.data != x) {
            System.out.println("Node not found");
            return;
        }

        if (first == last) {
            first = null;
            last = null;
        } else {
            if (save == first) {
                first = first.link;
                last.link = first;
            } else if (save == last) {
                pred.link = first;
                last = pred;
            } else {
                pred.link = save.link;
            }
        }
    }
     public void CIR_DISPLAY() {
        if (first == null) {
            System.out.println("Circular Linked List is empty.");
            return;
        }
        Node current = first;
        while (current.link != first) {
            System.out.print(current.data + " ");
            current = current.link;
        }
        // Print the last node
        System.out.print(current.data + " ");
        System.out.println();
    }
}

public class ImplementCircularLinkList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CirculerLinkedList list = new CirculerLinkedList();
        boolean isTrue = true;

        while (isTrue) {
            System.out.println("ENTER YOUR CHOICE:");
            System.out.println("1. CIR_INS_FIRST");
            System.out.println("2. CIR_INS_LAST");
            System.out.println("3. CIR_DELETE");
            System.out.println("4. CIR_DISPLAY");
            System.out.println("5. EXIT");

            int choice = sc.nextInt();
            int val;

            switch (choice) {

                case 1:
                    System.out.println("Enter number to insert at first in CircularLinkedList:");
                    val = sc.nextInt();
                    list.CIR_INS_FIRST(val);
                    break;

                case 2:
                    System.out.println("Enter number to insert at last in CircularLinkedList:");
                    val = sc.nextInt();
                    list.CIR_INS_LAST(val);
                    break;

                case 3:
                    System.out.println("Enter number to delete from CircularLinkedList:");
                    val = sc.nextInt();
                    list.CIR_DELETE(val);
                    break;

                case 4:
                    list.CIR_DISPLAY();
                    break;

                case 5:
                    isTrue = false;
                    break;
            }
        }
    }
}
