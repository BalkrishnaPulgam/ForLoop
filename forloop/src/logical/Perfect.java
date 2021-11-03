package logical;

public class Perfect {
	
	public static void main(String[] args) {
	
		int i,num,sum=0;
		num=6;
		
		for(i=1; i<num;i++) {
			if(num%i==0) {
				sum=sum+i;
			
			}
		}
		
		if(sum==num) {
			System.out.println("Number is Perfect");
		}
		else {
			System.out.println("Not Perfect");
		}

}
}