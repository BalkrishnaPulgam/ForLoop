package forloop1;

public class Display50To100 {

	public static void main(String[] args) {

		System.out.println("Display from 50 to 100:");
		for (int i = 50; i <= 100; i++) {
			System.out.print(i + " ");
		}

		System.out.println("\nDisplay from 200 to 150:");
		for (int i = 200; i >= 150; i--) {
			System.out.print(i + " ");
		}
		
		
		System.out.println("\nDisplay between 99 to 199:");
		for(int i=100; i<199; i++)
		{
			System.out.print(i+" ");
		}

	}

}
