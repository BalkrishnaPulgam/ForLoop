package pattern1Reverse;

import java.util.Scanner;

public class D {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of rows");
		int rows = sc.nextInt();
		sc.close();
		
		for(int i=1; i<=rows;i++) {
			for(int j=1; j<rows; j++) {
				System.out.print(" ");
			}
			for(int j=i; j<=rows; j++) {
				System.out.print(i +" ");
			}
			System.out.println();
		}
		
		
		
	}


}
