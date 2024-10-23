package com;

import java.util.Scanner;

/*
 * An Automorphic number is a number whose square ends with the same digits as the number itself. 
 * In other words, if you square the number, the last digits of the result should match the original number.
 * ex:- 
 */
public class AutomorphicNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = scanner.nextInt();
		
		int square = num*num;
		
		if(num%10==square%10) {
			System.out.println("Automorphic Number...");
		}else {
			System.out.println("Not a Automorphic Number...");
		}
	}
}
