package com.bridgelabz.logicalprograms;


	import java.util.ArrayList;
	import java.util.Scanner;
	import java.util.concurrent.ThreadLocalRandom;
	
	public class couponNumbers {
	    public static void couponGenerator(int range) {

	        ArrayList<Integer> arraylist = new ArrayList<>(range);

	        int count = 0;

	        while (count != range) {

	            int randomNumber = ThreadLocalRandom.current().nextInt(0, 10000+1);

	            if (!arraylist.contains(randomNumber)) {

	                arraylist.add(randomNumber);
	                count++;

	            }

	        }

	        for(int list:arraylist)    
	            System.out.println(list);

	    }

	    public static void main(String[] args) {
	        
	        System.out.println("Enter the number of coupons you want to generate: ");
	        Scanner sc = new Scanner(System.in);

	        int numberOfCoupons = sc.nextInt();
	        System.out.println("The Coupons generated are : ");
	        couponGenerator(numberOfCoupons);

	    }
	}

