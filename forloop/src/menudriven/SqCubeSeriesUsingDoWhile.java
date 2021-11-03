package menudriven;

public class SqCubeSeriesUsingDoWhile {

	public static void main(String[] args) {
		int n = 10;

		int i = 1;
		do {
			int sq = i * i;
			System.out.println("Suare of" + i + " is " + sq);
			i++;
		} while (i <= n);

	}

}
