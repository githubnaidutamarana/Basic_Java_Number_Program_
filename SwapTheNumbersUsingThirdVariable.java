package com;

import java.util.Scanner;

public class SwapTheNumbersUsingThirdVariable {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the First Number...");
		int num1 = scanner.nextInt();
		System.out.println("Enter the Second Number...");
		int num2 = scanner.nextInt();
		System.out.println("Enter the Third Number...");
		int num3 = scanner.nextInt();

		// Before Swaping the Numbers...
		System.out.println("Before Swaping the Numbers...");
		System.err.println(num1);
		System.err.println(num2);

		num3 = num1;
		num1 = num2;
		num2 = num3;

		// After Swaping The Numbers...
		System.out.println("After Swaping The Numbers...");

		System.err.println(num1);
		System.err.println(num2);
	}
}
