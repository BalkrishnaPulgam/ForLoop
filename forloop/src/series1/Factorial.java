package series1;

import java.util.Scanner;

public class Factorial {
	
	//Factorial of n is the product of all positive descending integers
	//4! = 4*3*2*1 = 24  
	//5! = 5*4*3*2*1 = 120
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int n = sc.nextInt();
		int fact=1;
		
		for(int i=1; i<=n; i++) {
			
			fact=fact*i;
		}
		
		System.out.println("Factorial number is :"+fact);
		
	}
	
	

}
