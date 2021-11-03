package menudriven;

import java.util.Scanner;

public class SqrCube {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		
		int sq = num*num;
		int Cube = num*num*num;
		
		System.out.println("Square "+num+"is "+sq);
		System.out.println("Cube "+num+"is "+Cube);
		
		
		sc.close();

	}

}
