import java.util.*;
class Stackdemo{
	int top;
	int a[];
	int n;

	Stackdemo(int n){
			this.n = n;
            this.a = new int[n];
            top = -1;
	}

public void push(int x){
	if(top>=n){
		System.out.println("stack overflow!!");
		return;
	}
	else
	{
		top=top+1;
		a[top]=x;
	    System.out.println("Pushed " + x + " onto the stack.");
		return;
	}
}
 public int pop(){
	if(top==0){
		System.out.println("stack underflow");
		return(0);
	}
	else
	{
		top=top-1;
	    System.out.println("Popped from the stack.");
	    return(a[top+1]);
	}
} 
public int peep(int I){
    if(top-I+1<=0){
    	System.out.println("stack underflow!!!");
    	 return -1;// Return a value indicating underflow
    }
    else 
    {
    	System.out.println("top element is "+a[top-I+1]);
    	return(a[top-I+1]);
    }
}
public void change(int y,int i){
    if(top-i+1<=0){
    	System.out.println("Invalid index. No element to change.");
    	return;
    }
    else {
    	a[top-i+1]=y; 
    	System.out.println("Changed element at index " + y + " to " + i);
    	return;
    }
}
 public void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack elements are: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }
}
public class StackImplement{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of stack:");
		int size = sc.nextInt();
		Stackdemo s = new Stackdemo(size);
		Boolean istrue = true;
		while(istrue){
            System.out.println("1. PUSH");
            System.out.println("2. POP");
            System.out.println("3. PEEP");
            System.out.println("4. CHANGE");
            System.out.println("5. DISPLAY");
            System.out.println("6. EXIT");
            System.out.print("Enter your choice: ");
            int n = sc.nextInt();
            switch (n) {
                case 1: 
           	        System.out.println("enter element you want to push");
           	        int x=sc.nextInt();
           	        s.push(x);
           	        break;

	           	case 2: 
	           	    s.pop();
	           	    break;

           	    case 3: 
		           	System.out.println("enter element you want to peep");
		           	int I=sc.nextInt();
		           	s.peep(I);
		           	break;

           	    case 4: 
		           	System.out.println("enter index to change");
		           	int y=sc.nextInt();
		           	System.out.print("Enter the new value: ");
		            int  i=sc.nextInt();
		           	s.change(y,i);
		           	break;
                case 5: 
		           	s.display();
		           	break;
                case 6:
                	istrue=false;
                 	break;
		}
	}
	}
}
