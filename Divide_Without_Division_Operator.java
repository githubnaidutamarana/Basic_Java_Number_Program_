package com;

public class Divide_Without_Division_Operator {

	public static void main(String[] args) {

		int divident = 32;
		int divisor = 5;
		int count = 0;

		while (divident >= divisor) {

			divident = divident - divisor;
			count++;

		}
		System.out.println(count);

	}

}
