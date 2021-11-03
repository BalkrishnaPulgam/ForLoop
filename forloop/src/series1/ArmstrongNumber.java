package series1;

import java.util.Scanner;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		
		int a, b=0,c=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		
		a=n;
	
		while(n>0) {
			
			c=n%10;
			b=b+(c*c*c);
			n=n/10;
						
		}
		
		if(b==a) {
			System.out.println("Number is Armstrong");
		}
		else {
			System.out.println("number is not Armstrong");
		}
		
		sc.close();
	}

}
