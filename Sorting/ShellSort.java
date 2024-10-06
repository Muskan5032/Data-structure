import java.util.Scanner;

public class ShellSort{
    
    public void shellsort(int arr[]){
	    int n = arr.length;

	    for(int gap = n/2;gap>=1;gap=gap/2){

	    	for(int j=gap;j<n;j++){

	    		for(int i = j-gap;i>=0;i=i-gap){

		    	    if(arr[i+gap]>arr[i]){
		    			break;
		    		}
		    		else
		    		{
		    			int temp = arr[i+gap];
		    			arr[i+gap] = arr[i];
		    			arr[i] = temp;
		    		}

	    		}
	    	}
	    }
    }

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter array size");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i=0;i<n;i++){
			System.out.println("enter array element"+i);
			arr[i] = sc.nextInt();
		}

		ShellSort ss = new ShellSort();
        ss.shellsort(arr);

        System.out.println("Sorted array is...");
		for(int i=0;i<n;i++){
			System.out.println(arr[i]+" ");
		}
	}
}