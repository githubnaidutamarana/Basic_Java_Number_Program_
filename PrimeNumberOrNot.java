package com;

import java.util.Scanner;

public class PrimeNumberOrNot {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = scanner.nextInt();
		
		boolean isPrime=true;
		
		for(int i=2;i<num;i++) {
			
			if(num%i==0) {
				isPrime=false;
			}
		}
		if(isPrime==true) {
			System.out.println("Prime Number...");
		}else {
			System.out.println("Not a Prime Number...");
		}
		
	}
}