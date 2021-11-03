package series1;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		
		int a, b=0, c=0;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		
		a=n;
		
		while(n>0) {
			
			c=n%10;
			b=(b*10)+c;
			n=n/10;
			
		}
		if(b==a) {
			System.out.println("Number is Palindrome");
		}
		else {
			System.out.println("number is not Palindrome");
		}
		
		
	}

}
