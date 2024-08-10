import java.util.Scanner;
 
 public class BinarySearch{
 
 	public static int Bsearching(int []a,int left,int right){
 		Scanner sc = new Scanner(System.in);
 		System.out.println("enter key to search");
 		int key = sc.nextInt();
 		 while(left<=right){
 		 	int middle = (left+right)/2;
 		 
	 		 if(a[middle]==key){
	 		 	return middle;
	 		 }
	 		 else if(a[middle]>key){
	 		 	right = middle-1;
	 		 }
	 		 else 
	 		 {
	 		 	left = middle+1;

	 		 }
	 	}
	 	return -1;
 	}
 	public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size:");
		int n = sc.nextInt();
		int []a = new int[n];
		System.out.println("enter array Elements:");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}

      int result = Bsearching(a, 0, n - 1);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } 
        else 
        {
            System.out.println("Element not found.");
        }
 	}
 }

