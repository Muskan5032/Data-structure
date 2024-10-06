import java.util.Scanner;
public class HeapSort{

    public void heapSort(int []arr){
    	int n = arr.length;

    	buildmaxheap(arr);

    	for(int i=n-1;i>=0;i--){
    		int temp = arr[0];
    		arr[0] = arr[i];
    		arr[i] = temp;

    		heapify(arr, i, 0);
    	}
    }

    public void buildmaxheap(int arr[]){
    	int n = arr.length;

    	for(int i=(n/2)-1;i>=0;i--){
    		heapify(arr,n,i);
    	}
    }

    public void heapify(int[] arr,int n,int i){
    		int maxindex=i;
    		int leftchild = 2*i+1;
    		int rightchild = 2*i+2;

    		if(leftchild<n&&arr[leftchild]>arr[maxindex]){
    			maxindex=leftchild;
    		}

    		if(rightchild<n&&arr[rightchild]>arr[maxindex]){
    			maxindex = rightchild;
    		}

    		if(i!=maxindex){
    			int temp = arr[i];
    			arr[i]=arr[maxindex];
    			arr[maxindex] = temp;
    			heapify(arr,n,maxindex);
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

		HeapSort hs = new HeapSort();
        hs.heapSort(arr);

		System.out.println("Sorted array is...");
		for(int i=0;i<n;i++){
			System.out.println(arr[i]+" ");
		}
	}
}
    

	