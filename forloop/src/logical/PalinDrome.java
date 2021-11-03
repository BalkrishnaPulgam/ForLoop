package logical;

//A Palindrome no. is the number that remains the same when its digits get reversed

public class PalinDrome {
	
	public static void main(String[] args) {
		
		int a, b=0,c=0;
				
		int n=121;
		
		a=n;
		
		while(n!=0) {
			c=n%10;
			
			b=(b*10)+c;
			n=n/10;
		}
		
		if (b==a) {
			System.out.println("no is Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}

}
