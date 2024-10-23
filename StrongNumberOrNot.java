package com;
/*
 * Strong Number:- Each digit factorial summation is equal to the given number.
 */
import java.util.Scanner;

public class StrongNumberOrNot {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = scanner.nextInt();
		
		int temp=num;
		int sum=0;
		while(temp>0) {
			
			int digit = temp%10;
			int fact=1;
			for(int i=1;i<=digit;i++) {
				fact=fact*i;
			}
			sum=sum+fact;
			temp/=10;
		}
		if(sum==num) {
			System.out.println("Strong Number...");
		}
		else {
			System.out.println("Not a Strong Number...");
		}
	}
}
