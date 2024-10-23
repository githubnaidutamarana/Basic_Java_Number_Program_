package com;

import java.util.Scanner;

public class PrimeNumberRange {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the First Number : ");
		int num1 = scanner.nextInt();
		System.out.println("Enter the Second Number : ");
		int num2 = scanner.nextInt();

		for (int i = num1; i <= num2; i++) {

			int count = 0;
			int temp = i;
			for (int j = 1; j <= temp; j++) {
				if (temp % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(i);
			}
		}
	}
}
