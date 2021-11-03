package series1;

public class EvenAndOddSeries {
	
	//Even & odd series between 1 to 20

	public static void main(String[] args) {

		int n = 20;

		System.out.println("Even Series:");
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println("\nOdd Series:");
		for (int i=1; i<=n; i++) {
			if(i%2!=0) {
				System.out.print(i+" ");
			}
		}

	}

}
