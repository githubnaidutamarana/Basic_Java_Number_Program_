package com;

import java.util.Scanner;

public class FibanociiSeries {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = scanner.nextInt();

		int a = 0;
		int b = 1;
		System.out.println(a);
		System.out.println(b);
		int sum = 0;
		for (int i = 2; i < num; i++) {
			sum = a + b;
			a = b;
			b = sum;
			System.out.println(sum);
		}
	}
}
