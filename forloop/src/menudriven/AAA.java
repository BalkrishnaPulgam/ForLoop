package menudriven;

import java.util.Scanner;

public class AAA {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First String");
		String a = sc.next();
		System.out.println("Enter the Second String");
		String b = sc.next();
		System.out.println("Please select from following operations");
		System.out.println("Enter 1 for Concatenation String");
		System.out.println("Enter 2 for Equal String");
		System.out.println("Enter 3 for Uppercase String");
		System.out.println("Enter 4 for Lowercase String");
		System.out.println("Enter you operation:");
		char ch = sc.next().charAt(0);

		switch (ch) {
		case '1':
			System.out.println("Concatenation String "+ a.concat(b));
			break;
			
		case '2':
			System.out.println("Equal String "+a.equals(b));
			break;
			
		case '3':
			System.out.println("Uppercase String is "+a.toUpperCase()+b.toUpperCase());
			break;
			
		case '4':
			System.out.println("Lowercase String is "+a.toLowerCase()+b.toLowerCase());
			break;
			
		default:
			System.out.println("Invalid entry");
		}

	}

}
