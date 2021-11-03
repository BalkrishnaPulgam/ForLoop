package forloop;

import java.util.Scanner;

public class AddEven {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		int no = sc.nextInt();
		sc.close();
		
		if (no%2==0) {
			System.out.println("Number is even");
		}
		else {
			System.out.println("number is odd");
		}
	}

}
