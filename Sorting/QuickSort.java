import java.util.Scanner;

public class QuickSort {
    public void quick_sort(int k[],int lb,int ub){
        boolean flag = true;
        if(lb<ub){
            int i = lb;
            int j = ub+1;
            int key = k[lb];

            while(flag==true){
                 
                i++;
                    while(i<k.length && k[i]<key){
                        i++;
                    }
                    j--;
            while(j>=0 && k[j]>key){
                j--;
            }
            if(i<j){
                int temp=0;
                temp = k[i];
                k[i]=k[j];
                k[j] = temp;
            }
            else{
                flag =false;
            }
            }
            int temp = k[lb];
            k[lb] = k[j];
            k[j] = temp;
            quick_sort(k,lb,j-1);
            quick_sort(k, j+1, ub);
        }
  
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array :");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0;i<n;i++){
            System.out.println("enter element at index "+i);
            arr[i] = sc.nextInt();
        }
        QuickSort k = new QuickSort();
        k.quick_sort(arr,0, arr.length-1);
        System.out.println("sorted array :");
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] +" "); 
        }
    
    }
}