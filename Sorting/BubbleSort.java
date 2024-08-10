import java.util.Scanner;
public class BubbleSort{
	public static void BUBBLE_SORT(int[]arr,int n){
		for(int i=0;i<n-1;i++){
			int exchs=0;
			for(int j=0;j<n-i-1;j++){
				if(arr[j]>arr[j+1]){
					int temp;
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					exchs=exchs+1;
				}
		    }
			    if(exchs==0){
				System.out.println("array is sorted");
				break;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter aray size");
		int n = sc.nextInt();
		int[]arr = new int[n];
		for(int i=0;i<n;i++){
			System.out.println("enter elemrnt"+i);
			arr[i]=sc.nextInt();
		}
		BUBBLE_SORT(arr,n);
		
		System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) { // Traditional for loop
            System.out.print(arr[i] + " "); // Print each element followed by a space
        }
	}
}