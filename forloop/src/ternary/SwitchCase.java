package ternary;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Characrter");
		char c = sc.next().charAt(0);

		switch (c) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("The letter is a Vowel " + c);
			break;

		default:
			System.out.println("The letter is Consonant " + c);

		}
		sc.close();
	}

}
