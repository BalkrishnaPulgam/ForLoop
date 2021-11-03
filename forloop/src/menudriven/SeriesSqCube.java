package menudriven;

public class SeriesSqCube {

	public static void main(String[] args) {

		int n = 10;

		System.out.println("Square Series of 1 to 10:");
		for (int i = 1; i <= n; i++) {

			int sq = i * i;
			System.out.println("Square of " + i + " is " + sq);

		}

		System.out.println("Cube Series of 1 to 10:");
		for (int i = 1; i <= n; i++) {
			int Cube = i * i * i;
			System.out.println("Cube of " + i + " is " + Cube);
		}

	}
}
