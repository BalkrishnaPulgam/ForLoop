package forloop;

import java.util.Scanner;

public class PrimeNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int no = sc.nextInt();
		
		sc.close();
		int a=0;
		
		for (int i=1; i<no; i++) {
			if(no%2==0) {
				a++;
				break;
			}
			
		}
		
		if (a==0) {
		System.out.println("prime no");
		}
		else {
			System.out.println("non prime");
		}
		
	}
}
