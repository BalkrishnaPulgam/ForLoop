package logical;

public class Armstrong {
	
	public static void main(String[] args) {
		
		
		int a, b=0,c=0;
		int n=153;
		
		a=n;
		
		while(n!=0) {
			
			c=n%10;
			b=b+(c*c*c);
			n=n/10;
			
		}
		if(b==a) {
			System.out.println("No. is Armstrong");
		}
		else {
			System.out.println("no is not Armstrong");
		}
		
	}

}
