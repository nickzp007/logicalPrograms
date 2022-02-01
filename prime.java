package com.bridgelabz.logicalprograms;

import java.util.*;

public class prime {

	public static void main(String[] args) {

		int number, i;

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		number=sc.nextInt();
		sc.close();

		if ( number >2 ) {
			for(i = 2; i<= number; i++)  {
				if(number % i == 0)
					System.out.println("number is not a prime number");
				else 
					System.out.println("number is a prime number");
				break;

			}
		}

		if ( number == 0 || number == 1 ) {
			System.out.println(" 0 and 1 are not counted as prime number");
		}
		else if ( number ==2 ) {
			System.out.println("All even number can be divide by 2");
			System.out.println("So 2 is only even prime number");
		}

	}
}


