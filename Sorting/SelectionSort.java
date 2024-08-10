import java.util.Scanner;
 	
public class SelectionSort{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter aray size");
		int n = sc.nextInt();
		int[]a = new int[n];
		for(int i=0;i<n;i++){
			System.out.println("enter elemrnt"+i);
			a[i]=sc.nextInt();
		}
		SELECTION_SORT(a,n);
	}
	public static void SELECTION_SORT(int []a,int n){
	for(int i=0;i<n-1;i++){
		int minindex=i;

		for(int j=i+1;j<n;j++){
			if(a[j]<a[minindex]){
				minindex=j;
			}
			
		}

		if(minindex!=i){
			int temp;
			temp=a[i];
			a[i]=a[minindex];
			a[minindex]=temp;
		}
		
	}
	for(int i=0;i<n;i++){
			System.out.println(a[i]);
		}
   }
}


