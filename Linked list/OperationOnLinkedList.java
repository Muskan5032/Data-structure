import java.util.*;
class Node{
	    int info;
		Node link;

	public Node(int data){
		this.info = data;
		this.link = null;
	}
}
// Define the LinkedList class to manage the operations on the list
class linkedListDemo{
	Node first;

    // Constructor to initialize an empty linked list
	linkedListDemo(){
		this.first = null;
	}

	// method to insert node at first in linked list
	public void InsertAtFirst(int data){
		Node newNode= new Node(data);
		if(first==null){
			first=newNode;
		}
		else
		{
			newNode.link=first;
			first = newNode;
		}
		System.out.println("node with value"+data+" inserted at first");
	}

	//method to display node in linked list 
	public void Display(){
		if(first==null){
			System.out.println("linked list is empty!!... can't display node:");
		}
		else
		{
			Node current = first;
			System.out.print("Linked list nodes: ");
			while (current != null) {
	            System.out.print(current.info + " -> ");
	            current = current.link;
	        }
	        System.out.println("null");
		}
	}

	//method to delete node at first in linked list
	public void DeleteAtFirst(){
		if(first==null){
			System.out.println("linked list is empty nothing to delete:");
			return;
		}
		else
		{
			first = first.link;
			System.out.println("node is deleted succesfully!!!!");
		}
	}

	// method to insert node at last in linked list
	public void InsertAtLast(int data){
		Node newNode = new Node(data);
		if(first == null){
			first = newNode;
		}
		else
		{
			Node save = first;
		while(save.link!=null){
			save = save.link;
		}
		save.link = newNode;
		System.out.println("node with value"+data+" inserted at last");
		}
	}

	//method to delete node at last in linked list
	public void DeleteAtLast(){
		if(first == null){
			System.out.println("linked list is empty. nothing to delete");
			return;
		}
		if(first.link == null){
			first = null;
			System.out.println("last node deleted");
			return;
		}
		Node save = first;
		while(save.link.link==null){
			save = save.link;
		}
		save.link = null;
		System.out.println("last node is deleted succesfully");
	}
}

    //  // method to insert node in order way
    //  public void InsertAtOrder(int data){
    //      Node newNode = new Node(data);
    //      if(first==null){
    //      	newNode.link = first;
    //      }
    //      else
    //      {
    //      	first = first.link;
    //      }
    // }
public class OperationOnLinkedList{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		linkedListDemo list = new linkedListDemo();
		Boolean istrue = true;

		while(istrue){
			System.out.println("eneter your choice:");
			System.out.println("1. INSERT NODE AT FIRST");
			System.out.println("2. Display NODE");
			System.out.println("3. DELETE FIRST NODE");
			System.out.println("4. INSERT NODE AT LAST");
			System.out.println("5. DELETE LAST NODE");
			System.out.println("6. EXIT");

			int choice = sc.nextInt();
			int val;

			switch(choice){

			    case 1:
			    	System.out.println("enter value to add at first");
			    	val = sc.nextInt();
			    	list.InsertAtFirst(val);
			    	break;

			    case 2:
			        list.Display();
			        break;

			    case 3:
			    	list.DeleteAtFirst();
			    	break;

			    case 4:
			        System.out.println("enter value to add last");
			        val = sc.nextInt();
			        list.InsertAtLast(val);
			        break;

			    case 5:
			        list.DeleteAtLast();
			        break;
                
                case 6:
                	istrue = false;
                	break;
			              
			}
		}

	}
}