import java.util.*;

class MyCircularQueue
{
	Scanner sc = new Scanner(System.in);
	int n;
	int f = -1 , r = -1;
	int arr[];
	MyCircularQueue(int n)
	{
		this.n = n;
		arr = new int[n];

	}
	public void cqInsert()
	{
		System.out.print("Enter number to be added : ");
		int x = sc.nextInt();
		
		if(r == n - 1)
			r = 0;
		else 
			r++;
		if(f == r)
			System.out.println("Queue is OverFLow!!!");
		else
		{
			arr[r] = x;
			System.out.println("A number is inserted!!!");

			if(f == -1)
			f = 0;
		}
		

		
	}

	public void cqDelete()
	{

		if(f == -1)
			System.out.println("Queue is UnderFlow");
		else
		{
			arr[f] = 0;
			
		}
		if(f == r)
		{
			f = -1;
			r = -1;
		}
		if(f == n - 1)
		{
			f = 0;

		}
		else 
		{
			f++;
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
public class ImplementCircularQueue
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter queue size: ");
		int n = sc.nextInt();
		MyCircularQueue q = new MyCircularQueue(n);
		boolean isTrue = true;
		while(isTrue)
		{
			System.out.println("1. CENQUEUE");
            System.out.println("2. CDEQUEUE");
            System.out.println("3. CDISPLAY");
            System.out.println("4. EXIT");

			int choice = sc.nextInt();
			switch(choice)
			{
				case 1 :
					q.cqInsert();
					break;
				case 2 : 
					q.cqDelete();
					break;
				case 3 :
					q.display();
					break;
				case 4 :
					isTrue = false;
					break;
							
			}
			
		}
	}
}
