package com.assignment2;

import java.util.Random;
import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Pick a number between 1 and 100");
		int userGuessNumber = inputMethod(scanner);

		// Generate Random Number
		Random randomNum = new Random();
		int randomNumber = randomNum.nextInt(100);

		for (int counter = 0; counter < 5; counter++) {
			if (userGuessNumber == randomNumber) {
				System.out.println("You win!");
				break;
			} else if (userGuessNumber < randomNumber) {
				System.out.println("Please pick a higher number");
			} else if (userGuessNumber > randomNumber) {
				System.out.println("Please pick a lower number");
			}
			if (counter < 4) {
				userGuessNumber = inputMethod(scanner);
			}
		}
		if (userGuessNumber != randomNumber) {
			System.out.println("You lose!");
		}
		System.out.println("The number to guess was:" + randomNumber);
		scanner.close();

	}

	// Get Guessed Number
	static int inputMethod(Scanner userGuess) {
		String userGuessString = userGuess.nextLine();
		int userGuessNumber = Integer.parseInt(userGuessString);
		while (userGuessNumber < 1 | userGuessNumber > 100) {
			System.out.println("Your guess is not between 1 and 100, please try again");
			userGuessString = userGuess.nextLine();
			userGuessNumber = Integer.parseInt(userGuessString);
		}
		return userGuessNumber;
	}

	// Compare guessed and Random Number
	static boolean compareMethod(int userGuessNumber, int randomNumber) {
		if (userGuessNumber == randomNumber) {
			System.out.println("You win!");
			return false;
		} else if (userGuessNumber < randomNumber) {
			System.out.println("Please pick a higher number");

		} else if (userGuessNumber > randomNumber) {
			System.out.println("Please pick a lower number");
		}
		return true;
	}

}
