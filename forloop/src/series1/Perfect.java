package series1;

import java.util.Scanner;

public class Perfect {
	
	//6=1*2*3 =1+2+3=6;
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter no");
		int num= sc.nextInt();
		
		int sum=0;
		
		for(int i=1; i<num; i++) {
			if(num%i==0) {
				sum=sum+i;
			}
				
	}
		if(sum==num) {
			System.out.println("Number is Perfect");
		}
		else {
			System.out.println("Number is not Perfect");
		}
			
		
		
		
		
		
	}
	
	
	

}
