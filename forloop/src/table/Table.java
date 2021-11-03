package table;

public class Table {

	public static void main(String[] args) {

		for (int table = 1; table <= 10; table++) {
			System.out.println("Table of " + table);
			
			for (int j = 1; j <= 10; j++) {
				
				System.out.println(table + " X " + j + " = " + (table * j));
				
			}
			System.out.println("----------");
		}

	}

}
