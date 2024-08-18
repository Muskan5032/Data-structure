import java.util.Scanner;
public class InsertionSort{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter aray size");
		int n = sc.nextInt();
		int[]a = new int[n];
		for(int i=0;i<n;i++){
			System.out.println("enter elemrnt"+i);
			a[i]=sc.nextInt();
		}
		INSERTION_SORT(a,n);
	}
	public static void INSERTION_SORT(int []a,int n){
		int i=1;
		while(i<n){
			int key = a[i];
			int j = i-1;

			while(j>=0&&a[j]>key){
				a[j+1]=a[j];
				j=j-1;
			}
			a[j+1]=key;
			i=i+1;
		}
	    for(i=0;i<n;i++){
			System.out.println(a[i]);
		}
	}
}