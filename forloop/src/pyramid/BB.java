package pyramid;

public class BB {
	
	public static void main(String[] args) {
		
		for(int i=0; i<=6; i++) {
			for(int j=6; j>i;j--) {
				System.out.print(" ");
			}
			
			int temp=1;
			for(int k=0; k<=i;k++) {
				System.out.print((k+temp)+" ");
			}
			System.out.println();
		}
		
	}

}
