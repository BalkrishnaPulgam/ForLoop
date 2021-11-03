package pattern4;


public class A {
	
	public static void main(String[] args) {
		
		
		int alphabet = 65; //ASCII value of alphabet A
		
		for (int i=0; i<=5; i++) {
			int temp =i;
			for(int j=i; j>=0; j--) {
				System.out.print((char)(alphabet+temp)+" ");
				temp = temp+5;
			}
			System.out.println("");
		}
		
	
	}
}
