package forloop;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter year");
		int year = sc.nextInt();
		sc.close();
		boolean isLeap = false;
		
		
		if(year % 4 == 0) {
			if (year%100==0) {
				if (year%400==0) {
					isLeap=true;
				}
				 isLeap=true;
				
			}
			 isLeap=true;
			
		}
		 
		
		if(isLeap==true) {
			System.out.println(year + "is a leap year");
		}
		else {
			System.out.println(year+ "is not a leap year");
		}
       
    }
}
