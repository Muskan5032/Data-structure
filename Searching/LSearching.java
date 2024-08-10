import java.util.*;

class LSearching{
	public static int LinearSearch(int[]a){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter key");
		int key = sc.nextInt();
		 for(int i=0;i<a.length;i++){    
            if(a[i] == key){
            System.out.println(key+"found at index "+i);    
                return i;    
            }    
        }    
         return -1;    
    }    

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter array size:");
		int n = sc.nextInt();
		int []a = new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
        Searching s1 = new Searching();
        s1.LinearSearch(a);
	}
}	