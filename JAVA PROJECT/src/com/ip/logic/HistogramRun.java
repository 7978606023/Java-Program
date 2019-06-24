package com.ip.logic;

import java.util.Random;
import java.util.Scanner;

class HistogramRun {
	public static void main(String[] args) {
		
		System.out.print("Please enter how many times you want to roll two dice?");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] rolls = new int[n];

		Random r1 = new Random();
		Random r2 = new Random();

		int dice1;
		int dice2;

		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		int seven = 0;
		int eight = 0;
		int nine = 0;
		int ten = 0;
		int eleven = 0;
		int twelve = 0;

		for (int roll = 0; roll < rolls.length; roll++) {
			dice2 = r2.nextInt(6) + 1;
			dice1 = r1.nextInt(6) + 1;
			System.out.println(roll + " The first dice rolled a " + dice1 + " the second dice rolled a " + dice2);

			int sum;
			sum = dice1 + dice2;

			if (sum == 2)
				two++;
			if (sum == 3)
				three++;
			if (sum == 4)
				four++;
			if (sum == 5)
				five++;
			if (sum == 6)
				six++;
			if (sum == 7)
				seven++;
			if (sum == 8)
				eight++;
			if (sum == 9)
				nine++;
			if (sum == 10)
				ten++;
			if (sum == 11)
				eleven++;
			if (sum == 12)
				twelve++;

		}
		System.out.println("Histogram of rolls:");
		System.out.println("2 occurred " + two + " times");
		System.out.println("3 occurred " + three + " times");
		System.out.println("4 occurred " + four + " times");
		System.out.println("5 occurred " + five + " times");
		System.out.println("6 occurred " + six + " times");
		System.out.println("7 occurred " + seven + " times");
		System.out.println("8 occurred " + eight + " times");
		System.out.println("9 occurred " + nine + " times");
		System.out.println("10 occurred " + ten + " times");
		System.out.println("11 occurred " + eleven + " times");
		System.out.println("12 occurred " + twelve + " times");

	}

}