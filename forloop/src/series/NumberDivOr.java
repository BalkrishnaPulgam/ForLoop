package series;

import java.util.Scanner;

public class NumberDivOr {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");	
		int no1 = sc.nextInt();
		System.out.println("Enter 2nd number");	
		int no2 = sc.nextInt();
		sc.close();
		
				
		for(int i=no1; i<=no2; i++) {
			if(i%3==0 && i%5==0) {
				System.out.println("Output is:"+i);
			}
			
		}
	}


}
