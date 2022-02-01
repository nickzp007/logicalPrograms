package com.bridgelabz.logicalprograms;

import java.util.*;

public class perfectnumber {


	public static void main(String[] args) {

		int num, sumOfDivisors, i;
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a number");
		num=sc.nextInt();
		sc.close();
		sumOfDivisors=0;

		for (i = 1; i < num; i++) {
			while (num % i == 0) {
				System.out.println(i);
				sumOfDivisors=sumOfDivisors+i;
				break;

			}
		}

		if (num == sumOfDivisors) {
			System.out.println(num+" is a Perfect Number");
		}
		else
			System.out.println(num+" is Not a Perfect Number");


	}
}	


