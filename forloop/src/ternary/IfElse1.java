package ternary;

import java.util.Scanner;

public class IfElse1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int no = sc.nextInt();
		sc.close();
		
		if(no>100) {
			System.out.println("no is greater than 100");
		}
		else {
			System.out.println("no is smaller than 100");
		}
		
		
	}

}
