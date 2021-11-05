package rectangular;

public class KK {

	public static void main(String[] args) {
		int rows = 5;
		int alphabet = 65;
		for (int i = 0; i <=rows; i++) {
			int temp = i;
			for (int j = 0; j <= i; j++) {
				System.out.print((char) (alphabet +temp) + " ");
				temp = temp + 4;
			}
			System.out.println();

		}
	}

}
