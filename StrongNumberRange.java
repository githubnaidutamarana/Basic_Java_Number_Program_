package com;

import java.util.Scanner;

public class StrongNumberRange {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the First Number : ");
		int num1 = scanner.nextInt();
		System.out.println("Enter the Second Number : ");
		int num2 = scanner.nextInt();
		
		for(int i=num1;i<=num2;i++) {
			int sum=0;
			int temp=i;
			while(temp>0) {
				int digit = temp%10;
				int fact=1;
				for(int j=1;j<=digit;j++) {
					fact=fact*j;
				}
				sum=sum+fact;
				temp/=10;
			}
			if(sum==i) {
				System.out.println(i);
			}
		}
	}
}
