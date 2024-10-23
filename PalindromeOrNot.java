package com;

import java.util.Scanner;

public class PalindromeOrNot {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = scanner.nextInt();
		int temp =num;
		int reverse=0;
		while(temp>0) {
			int rem = temp%10;
			reverse = reverse*10+rem;
			temp/=10;
		}
		if (reverse == num) {
			System.out.println("Palindrome...");
		}
		else {
			System.out.println("Not a palindrome...");
		}
	}
}
