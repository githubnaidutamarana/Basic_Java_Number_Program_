package com;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CurrentDate {
	public static void main(String[] args) {
		// Get the current date
		LocalDate currentDate = LocalDate.now();

		// Define the desired date format
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		// Format the date
		String formattedDate = currentDate.format(formatter);

		// Print the formatted date
		System.out.println("Current date in dd/MM/yyyy format: " + formattedDate);
	}

}
