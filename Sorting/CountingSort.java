import java.util.Scanner;

public class CountingSort{  
      
     int getMax(int[] a) {
        int n = a.length;  
        int max = a[0];  
        for(int i = 1; i < n; i++) {  
            if(a[i] > max)  
                max = a[i];  
        }  
        return max;
    }  

  
    public void countSort(int[] a){
        int n = a.length; 
        int max = getMax(a);   
        int[] count = new int[max + 1];
        int[] output = new int[n]; 
      
      // Initialize count array
      for (int i = 0; i <= max; i++) {  
            count[i] = 0; 
        }  
        
       // Store the count of each number
       for (int i = 0; i < n; i++) {
            count[a[i]]++; 
        }  
       
       // Update count array to contain actual positions
       for(int i = 1; i <= max; i++) {   
            count[i] += count[i - 1]; 
        } 
      
      // Build the output array
      for (int i = n - 1; i >= 0; i--) {
            output[count[a[i]] - 1] = a[i];  
            count[a[i]]--;
        }  
     
     // Copy the sorted elements into the original array
     for(int i = 0; i < n; i++) {  
            a[i] = output[i];  
        }   
    }   
    public static void main(String args[]){ 
        Scanner sc = new Scanner(System.in);

        System.out.println("enter array size");
        int n = sc.nextInt();

        int a[] = new int[n];

        for(int i=0;i<n;i++){
            System.out.println("enter array element"+i);
            a[i] = sc.nextInt();
        } 
        
        CountingSort cs = new CountingSort();
        cs.countSort(a); 
       
        System.out.println("Sorted array is...");
        for(int i=0;i<n;i++){
            System.out.println(a[i]+" ");
        }  
    }
}  