package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Number to Get reverse of it : ");

		int UserNumber = scanner.nextInt();

		System.out.println("Reverse Number of Entered Number ");

		System.out.println(ReverseMethod(UserNumber));

		scanner.close();
	}

	public static int ReverseMethod(int UserNumber) {
		int reverseNumber = 0;
		int rem = 0;
		while (UserNumber != 0) {
			rem = UserNumber % 10;
			reverseNumber = reverseNumber * 10 + rem;
			UserNumber = UserNumber / 10;

		}

		return reverseNumber;

	}
}

