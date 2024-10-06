import java.util.Scanner;

public class RadixSort{

    public void radixsort(int[]arr,int n,int place){

    	int output[]=new int[n];
        int count[]=new int[10];

        for(int i=0;i<10;i++){
            count[i]=0;
        }

        for(int i=0;i<n;i++){
            count[(arr[i]/place)%10]++;
        }

        for(int i=1;i<10;i++){
            count[i]+=count[i-1];
        }

        for(int i=n-1;i>=0;i--){
            output[count[(arr[i]/place)%10]-1]=arr[i];
            count[(arr[i]/place)%10]--;
        }

        for(int i=0;i<n;i++){
            arr[i] = output[i];
        }
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("enter array size");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            System.out.println("enter array element" + i);
            arr[i] = sc.nextInt();
        } 

        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        
         for (int place = 1; max / place > 0; place *= 10) {
            RadixSort rs = new RadixSort();
            rs.radixsort(arr, n, place);
        }
       
        System.out.println("Sorted array is...");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }  
	}
}