package forloop;

import java.util.Scanner;

public class Table {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int a = sc.nextInt();
		sc.close();
		
		for (int i=1; i<=10; i++) {
			System.out.println(i*a);
		}
	}


}
