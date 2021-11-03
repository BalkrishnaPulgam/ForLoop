package menudriven;

public class SqCubeSeriesUsingWhile {
	
	public static void main(String[] args) {
		
		
		int n=10;
		
		
		/*
		 * System.out.println("Square series of 1 to 10"); int i=1; while(i<=n) { int
		 * sq=i*i; System.out.println("Square of" +i+ " is "+sq); i++; }
		 */
		
		System.out.println("Cube Series of 1 to 10 :");
		
		int i =1;
		while (i<=n) {
			
		int	cube=i*i*i;
			System.out.println("Cube of "+ i+ " is "+cube);
			i++;
		}
		
		
		
		
		
		
		
	}

}
