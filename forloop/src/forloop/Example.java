package forloop;

import java.util.Scanner;

public class Example {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
		System.out.println("enter 1st number");;
		int no1 = sc.nextInt();
		//System.out.println("enter 2nd number");;
		//int no2 = sc.nextInt();
		
		sc.close();
		int fact=1;
		
		//System.out.println("output="+ (no1*no2));
		
		for (int i=1; i<=no1; i++) {
			
				fact=fact*i;
							
		}
		System.out.println("number is"+fact);
		
	}

}
