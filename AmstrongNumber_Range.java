package com;

import java.util.Scanner;

public class AmstrongNumber_Range {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the First Number : ");
		int num1 = scanner.nextInt();
		System.out.println("Enter the Second Number : ");
		int num2 = scanner.nextInt();

		for (int i = num1; i <= num2; i++) {

			int temp1 = i;
			int temp2 = i;
			int count = 0;
			while (temp1 > 0) {
				count++;
				temp1 /= 10;
			}
			int sum = 0;
			while (temp2 > 0) {
				int digit = temp2 % 10;
				int fact = 1;

				for (int j = 1; j <= count; j++) {
					fact = fact * digit;
				}
				sum = sum + fact;
				temp2 /= 10;
			}
			if (sum == i) {
				System.err.println(i);
			}
		}
	}
}
