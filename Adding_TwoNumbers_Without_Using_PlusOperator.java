package com;

import java.util.Scanner;

public class Adding_TwoNumbers_Without_Using_PlusOperator {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the First Number : ");
		int num1 = scanner.nextInt();
		System.out.println("Enter the Second Number : ");
		int num2 = scanner.nextInt();

		while (num2 != 0) {
			num1++;
			num2--;
		}
		System.out.println(num1);

	}
}
