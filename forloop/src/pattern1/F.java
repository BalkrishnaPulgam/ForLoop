package pattern1;

import java.util.Scanner;

public class F {
	
public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of rows");
		int rows = sc.nextInt();
			sc.close();
			
		for(int i=1; i<=rows; i++) { 
			for(int j=1; j<=rows; j++) {
				if (j%2==0) {
					System.out.print("@"+" ");
				}
				else {
					System.out.print("*"+" ");
				}
				
			}
			System.out.println();
		}
	}

}
