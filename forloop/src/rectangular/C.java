package rectangular;

import java.util.Scanner;

public class C {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows:");
		int rows =sc.nextInt();
		//int alphabet = 65; //ASCII value of alphabet A
		
		for (int i=0; i<=rows; i++) {       //rows
			for (int j=0; j<=i; j++ ) {     ///columns
				System.out.print(j+" ");
				
			}
			System.out.println();
		}
		
		sc.close();
		
	}

}
