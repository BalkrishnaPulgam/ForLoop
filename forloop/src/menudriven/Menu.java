package menudriven;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First number");
		int a = sc.nextInt();
		System.out.println("Enter the Second number");
		int b = sc.nextInt();
		System.out.println("Please select from following operations");
		System.out.println("Enter + for Addition");
		System.out.println("Enter - for Subtraction");
		System.out.println("Enter * for Multipilication");
		System.out.println("Enter / for Division");
		System.out.println("Enter you operation:");
		char ch = sc.next().charAt(0);

		switch (ch) {

		case '+':
			System.out.println("Addition of a and b is "+(a+b));
			break;
			
		case '-':
			System.out.println("Substraction of a and b is "+(a-b));
			break;
			
		case'*':
			System.out.println("Multiplication of a and b is "+(a*b));
			break;
			
		case'/':
			System.out.println("Division of a and b is "+(a/b));
			break;
			
		default:
			System.out.println("Invalid entry");
			

		}
		sc.close();

	}

}
