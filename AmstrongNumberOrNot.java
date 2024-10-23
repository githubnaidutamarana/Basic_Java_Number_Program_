package com;
/*
 * 	An Armstrong number (also known as a narcissistic number or pluperfect digital invariant)
 *  is a number that is equal to the sum of its own digits, each raised to the power of the number of digits.
 *  
 */
import java.util.Scanner;

public class AmstrongNumberOrNot {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = scanner.nextInt();
		int temp = num;
		int temp1 = num;
		int count = 0;
		while (temp > 0) {
			count++;
			temp /= 10;
		}
		int sum = 0;
		while (temp1 > 0) {
			int fact = 1;
			int rem = temp1 % 10;
			for (int j = 1; j <= count; j++) {
				fact = fact * rem;
			}
			sum = sum + fact;
			temp1 /= 10;
		}
		if (sum == num) {
			System.out.println("Amstrong Number...");
		} else {
			System.out.println("Not a Amstrong Number...");
		}
	}
}
