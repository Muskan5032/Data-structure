import java.util.*;
class Node{
	int data;
	Node link;
   
   public Node(int data){
   	this.data = data;
   	this.link=null;
   }
}
class stackDemo{
	Node top;
//push method
public void push(int data){
	Node newNode = new Node(data);
	if(top==null){
		top =newNode;
		return;
	}
	else
	{
		newNode.link = top;
		top = newNode;
		System.out.println(data+"pushed into stack");
		return;
	}
}
//pop method
public void pop(){
		if(top==null){
			System.out.println("linked list is empty nothing to delete:");
			return;
		}
		else
		{
			top = top.link;
			System.out.println("node is deleted succesfully!!!!");
		}
	}
	public void Display(){
		if(top==null){
			System.out.println("linked list is empty!!... can't display node:");
		}
		else
		{
			Node current = top;
			System.out.print("Linked list nodes: ");
			while (current != null) {
	            System.out.print(current.data + " -> ");
	            current = current.link;
	        }
	        System.out.println("null");
		}
	}

}  
public class StackImplementInLinkedList{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		stackDemo s = new stackDemo();
		Boolean istrue = true;


		while(istrue){
			System.out.println("enter your choice");
			System.out.println("1.PUSH");
			System.out.println("2.POP");
			System.out.println("3.DISPLAY");
			System.out.println("4. EXIT");
		    int choice = sc.nextInt();
			int val;

			switch(choice){
				 case 1:
			    	System.out.println("enter value to add at first");
			    	val = sc.nextInt();
			    	s.push(val);
			    	break;
			     case 2:
			    	s.pop();
			    	break;
			     case 3:
			        s.Display();
			        break;
			     case 4:
                	istrue = false;
                	break;
			}
		}
	}
}