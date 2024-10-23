package com;

import java.util.Scanner;

/*
 * PerfectNumber:-Sum of factors is equal to the given number
 */
public class Perfect_NumberOrNot {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = scanner.nextInt();
		int temp=num;
		int sum = 0;
		for (int i = 1; i < num; i++) {

			if (num % i == 0) {
				sum += i;
			}
		}
		if (sum == temp) {
			System.out.println("Perfect Number...");
		} else {
			System.out.println("Not a PerfectNumber;");
		}
	}
}
