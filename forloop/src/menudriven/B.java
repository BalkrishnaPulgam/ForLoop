package menudriven;

import java.util.Scanner;

public class B {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First number");
		int a = sc.nextInt();
		System.out.println("Enter the Second number");
		int b = sc.nextInt();
		System.out.println("Please select from following operations");
		System.out.println("Enter 1 for Addition");
		System.out.println("Enter 2 for Subtraction");
		System.out.println("Enter 3 for Multipilication");
		System.out.println("Enter 4 for Division");
		System.out.println("Enter you operation:");
		int ch = sc.nextInt();

		switch (ch) {

		case 1:
			System.out.println("Addition of a and b is "+(a+b));
			break;
			
		case 2:
			System.out.println("Substraction of a and b is "+(a-b));
			break;
			
		case 3:
			System.out.println("Multiplication of a and b is "+(a*b));
			break;
			
		case 4:
			System.out.println("Division of a and b is "+(a/b));
			break;
			
		default:
			System.out.println("Invalid entry");
			

		}
		sc.close();

	}


}
