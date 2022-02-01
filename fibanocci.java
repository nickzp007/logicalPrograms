package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class fibanocci {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a=0, b=1, c, i;
		a=sc.nextInt();
		b=sc.nextInt();
		sc.close();

		System.out.println("Fibanocci series for entered numbers: " );
		for (i=0; i <= 10; i++) {
			c=a+b;
			System.out.print(c+",");
			a=b;
			b=c;
		}

	}

}
