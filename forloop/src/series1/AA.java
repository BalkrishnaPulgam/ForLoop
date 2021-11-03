package series1;

import java.util.Scanner;

public class AA {
	
	public static void main(String[] args) {
		int n=131;
		int a, b=0, c=0;
		
		a=n;
		
		while(n>0) {
			
			c=n%10;
			b=c+(b*10);
			n=n/10;
			
			
		}
		if(b==a) {
		System.out.println("number is palindrome");
	}
		else {
			System.out.println("not");
		}
	
	
	
	
	
	}}
