import java.util.Scanner;

public class MergeShort {
    static int[] arr;
    public static void mergesort(int low,int high){
        if(low<high){
            int mid=(high+low)/2;
            mergesort(low, mid);
            mergesort(mid+1, high);
            merge(low, mid, high);
        }
        
    }
    public static void  merge(int low,int mid,int high){
        int i=low;
        int j=mid+1;
        int[] ans=new int[high-low+1];
        int k=0;
        while(i<=mid && j<=high){
            if(arr[i]<=arr[j]){
                ans[k++]=arr[i++];
            }else{
                ans[k++]=arr[j++];
            }
        }
        while (i<=mid) {
            ans[k++]=arr[i++];      
        }
        while (j<=high) {
            ans[k++]=arr[j++];
        }
        k=0;
        for(int a=low;a<=high;a++){
            arr[a]=ans[k++];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        arr = new int[n];
        System.out.println("Enter array elemrnt");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        mergesort(0,n-1);
        for (int k = 0; k < n; k++) {
            System.out.println(arr[k]);           
        }
    }
}