package com;

import java.util.Scanner;

public class Palindrome_Range {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the First Number : ");
		int num1 = scanner.nextInt();
		System.out.println("Enter the Second Number : ");
		int num2 = scanner.nextInt();
		
		for(int i=num1;i<=num2;i++) {
			
			int temp=i;
			int reverse=0;
			
			while(temp>0) {
				int rem = temp%10;
				reverse =reverse*10+rem;
				temp/=10;
			}
			if(reverse == i) {
				System.out.println(i);
			}
		}
	}
}
