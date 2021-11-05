package pattern1Reverse;

public class AAA {

	public static void main(String[] args) {
		int rows = 5;
		for (int i = 1; i <= rows; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}

		for (int a =2; a <= 5; a++) {
			for (int b = 1; b <= a; b++) {
				System.out.print(" ");
			}
			for (int c = 5; c >= a; c--) {
				System.out.print(a + " ");
			}
			System.out.println();
		}

	}

}
