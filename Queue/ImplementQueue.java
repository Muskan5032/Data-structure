import java.util.Scanner;

class QueueDemo {
    Scanner sc = new Scanner(System.in);
    int n;
    int f = -1, r = -1;
    int[] arr;

    // QueueDemo(int n) {
    //     this.n = n;
    //     arr = new int[n];
    // }

    public void ENQUEUE(int y) {
        if (r >= n - 1) {
            System.out.println("Queue overflow!!");
        }
        else
        {
            if (f == -1) {
                f = 0;
            }
            arr[++r] = y;
        }
    }

    public int DEQUEUE() {
        if (f == -1) {
            System.out.println("Queue underflow");
            return -1; 
        }
        else
        {
            int y = arr[f];
            if (f == r) {
                f = -1;
                r = -1;
            } 
            else
            {
                f++;
            }
            return y;
        }
    }

    public void display() {
        if (f == -1) {
            System.out.println("Queue is empty. Nothing to display.");
        }
        else
        {
            for (int i = f; i <= r; i++) {
                System.out.println(arr[i]);
            }
        }
    }
}

public class ImplementQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter queue size:");
        int n = sc.nextInt();
        QueueDemo que = new QueueDemo();
        boolean isTrue = true;

        while (isTrue) {
            System.out.println("1. ENQUEUE");
            System.out.println("2. DEQUEUE");
            System.out.println("3. DISPLAY");
            System.out.println("4. EXIT");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter number to be added: ");
                    int x = sc.nextInt();
                    que.ENQUEUE(x);
                    break;

                case 2:
                    que.DEQUEUE();
                    break;

                case 3:
                    que.display();
                    break;

                case 4:
                    isTrue = false;
                    break;

            }
        }
    }
}
