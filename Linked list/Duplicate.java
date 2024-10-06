import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node() {}

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

public class Duplicate {
    
    public static Node removeDuplicates(Node head) {
        Node current = head;

        while (current != null) {
            Node runner = current;
            while (runner.next != null) {
                if (runner.next.data == current.data) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next; 
                }
            }
            current = current.next; 
        }
        return head;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node dummy = new Node();
        Node tail = dummy;

        System.out.println("Enter elements of linked list (enter -1 to stop):");
        
        while (true) {
            int x = sc.nextInt();
            if (x == -1) break;
            Node newNode = new Node(x, null);
            tail.next = newNode;
            tail = newNode; // Move tail pointer
        }

        Node head = dummy.next; 

        System.out.print("Original Linked List: ");
        printList(head);

        head = removeDuplicates(head);

        System.out.print("Linked List after removing duplicates: ");
        printList(head);
        
        sc.close(); 
    }

    private static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
