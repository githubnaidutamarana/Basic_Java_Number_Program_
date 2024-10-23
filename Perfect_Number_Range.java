package com;

import java.util.Scanner;

/*
 * PerfectNumber:-Sum of factors is equal to the given number
 */
public class Perfect_Number_Range {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the First Number : ");
		int num1 = scanner.nextInt();
		System.out.println("Enter the Second Number : ");
		int num2 = scanner.nextInt();

		for (int i = num1; i <= num2; i++) {
			int sum = 0;
			int temp=i;
			for (int j = 1; j < temp; j++) {
				if (temp%j == 0) {
					sum = sum + j;
				}
			}
			if (sum == i) {
				System.out.println(i);
			}

		}
	}
}
