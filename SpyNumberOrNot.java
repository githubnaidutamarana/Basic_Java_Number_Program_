package com;

import java.util.Scanner;

public class SpyNumberOrNot {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = scanner.nextInt();
		int temp=num;
		int sum=0;
		int product=1;
		 
		while(temp>0) {
			int rem = temp%10;
			sum+=rem;
			product*=rem;
			temp/=10;
		}
		if(product==sum) {
			System.out.println("Spy Number...");
		}
		else {
			System.out.println("Not a Spy Number...");
		}
	}
}
