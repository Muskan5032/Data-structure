//. How stack can be used to recognize strings aca, bcb, abcba, abbcbba? Implement a program

import java.util.*;
class StringRecognize{
	String str;
	StringRecognize(String str){
		this.str=str;
	}
	public boolean ispalindrom(){
		Stack<Character> s = new Stack<>();
		int n = str.length();
		int i=0;
		char ch = str.charAt(0);
		while(ch!='c'){
			s.push(ch);
			i++;
			ch = str.charAt(i);
			if(ch==' '){
				return false;
			}
		}

		char x;
		while(!s.isEmpty()){
			i++;
			ch=str.charAt(i);
			x=s.pop();
			if(ch!= x){
				return false;
			}
		}
		ch=str.charAt(i+1);
		if(ch==' '){
			return true;
		}
		else
		{
			return false;
		}
	}
}
public class StringR{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enetr string:");
		String str = sc.nextLine();
		StringRecognize s1 = new StringRecognize(str + " ");
		if(s1.ispalindrom()){
			System.out.println("valid string");
		}
		else
		{
			System.out.println("invalid string");
		}
	}
}


