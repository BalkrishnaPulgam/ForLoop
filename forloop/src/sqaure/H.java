package sqaure;

import java.util.Scanner;

public class H {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of rows");
		int rows = sc.nextInt();
		int alphabets=65;
		for (int i=0; i<=rows; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print((char)(alphabets+i+j)+" ");
			}
			System.out.println();
		}
		
	}

}
