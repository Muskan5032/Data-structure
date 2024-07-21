import java.util.*;
class Node{
	    int info;
		Node link;

	public Node(int data){
		this.info = data;
		this.link = null;
	}
}
public class ImplementNode{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter data");
		int data = sc.nextInt();
        Node newNode = new Node(data);
        System.out.println("Node data ="+newNode.info);
	}
}