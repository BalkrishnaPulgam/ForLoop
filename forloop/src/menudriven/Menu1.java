package menudriven;

import java.util.Scanner;

public class Menu1 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 1st number");
		int num1=sc.nextInt();
		System.out.println("Enter 2nd number");
		int num2=sc.nextInt();
		System.out.println("Choose below one operations");
		System.out.println("enter + for addition");
		System.out.println("enter - for subtraction");
		System.out.println("enter * formultiplication");
		System.out.println("enter / fordivision");
		char ch=sc.next().charAt(0);
		
		switch (ch) {
		
		case '+':
			System.out.println(num1+num2);
		break;
		case'-':
			System.out.println(num1-num2);
			break;
		case'*':
			System.out.println(num1*num2);
			break;
		case'/':
		try {
			System.out.println(num1/num2);
		}catch(Exception e) {
			System.out.println("b cannot be 0(Zero) for Division Operation");
		}
		
		}
		
		
	}

}
