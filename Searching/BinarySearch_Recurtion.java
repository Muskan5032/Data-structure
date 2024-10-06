import java.util.Scanner;

public class BinarySearch_Recurtion{

	 public static int binarySearch(int[] a, int left, int right, int key) {
        if (left <= right){

            int middle = (left + right) / 2;
            
            if (a[middle] == key){
                return middle;
            } 
            else if (key < a[middle]) {
                return binarySearch(a, left, middle - 1, key);
            } 
            else
            {
                return binarySearch(a, middle + 1, right, key);
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

		System.out.println("Enter the key to search:");
        int key = sc.nextInt();

		int result = binarySearch(a, 0, n - 1,key);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } 
        else 
        {
            System.out.println("Element not found.");
        }

	}
}