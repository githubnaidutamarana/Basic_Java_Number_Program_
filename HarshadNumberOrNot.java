package com;
import java.util.Scanner;
/*
 * A Harshad number (also known as a Niven number) is a positive integer 
 * 					that is divisible by the sum of its digits
 */
public class HarshadNumberOrNot {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = scanner.nextInt();
		int temp = num;
		int sum = 0;

		while (temp > 0) {
			int rem = temp % 10;
			sum += rem;
			temp /= 10;
		}
		if (num % sum == 0) {
			System.out.println("Harshad Number...");
		} else {
			System.out.println("Not an Harshad Number...");
		}
	}
}
