import java.util.Scanner;

class Node {
    int data;
    Node link;

    Node(int data) {
        this.data = data;
        this.link = null;
    }
}

class Queue {
       Node front;
       Node rear;
       int size;

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.link = newNode;
            rear = newNode;
        }
        size++;
        System.out.println(data + " enqueued to the queue.");
    }

    public void dequeue() {
        if (front == null) {
            System.out.println("Queue is empty.");
            return;
        }
        int removedData = front.data;
        front = front.link;
        if (front == null) {
            rear = null;
        }
        size--;
        System.out.println(removedData + " dequeued from the queue.");
    }

    public void peek() {
        if (front == null) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Front element is " + front.data);
        }
    }

    public void getSize() {
        System.out.println("Size of the queue is " + size);
    }

    public boolean isEmpty() {
        return front == null;
    }
}

public class QueueImplementInLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue queue = new Queue();
        boolean istrue = true;

        while (istrue){

            System.out.println("\nQueue Operations Menu:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Get Size");
            System.out.println("5. Check if Empty");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

             int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data to enqueue: ");
                    int data = sc.nextInt();
                    queue.enqueue(data);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.peek();
                    break;
                case 4:
                    queue.getSize();
                    break;
                case 5:
                    System.out.println("Queue is empty: " + queue.isEmpty());
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;

            }
        } 
    }
}

