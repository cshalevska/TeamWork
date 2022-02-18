package com.syntax.teamwork;

public class Task06 {

	public static void main(String[] args) {
		int number = 20;
		boolean isPrime = true;
		if (number > 1) {

			for (int i = 2; i < number; i++) {

				if (number % i == 0) {
					isPrime = false;
					break;
				}
			}

		} else {
			isPrime = false;
		}

		if (isPrime) {
			System.out.println(number + " is prime ");
		} else {
			System.out.println(number + " is not prime ");
		}
	}
}