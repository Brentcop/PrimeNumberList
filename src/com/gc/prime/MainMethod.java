package com.gc.prime;

import java.util.Scanner;

/**
 * @author Jill Xu 5/19/2018
 *
 */
public class MainMethod {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		Prime primeNum = new Prime();
		String count = "y";

		System.out.println("Let's locate some primes!\n");
		System.out.println("This application will find you any prime, inorder, from first prime number on.");

		while (count.equalsIgnoreCase("y")) {
			System.out.println("Which prime number are you looking for?");
			int input = scnr.nextInt();

			System.out.println("\nThe number " + input + " prime is " + primeNum.prime(input)+".\n");
			scnr.nextLine();
			System.out.println("Do you want to find another prime number?(y/n): ");
			count = scnr.nextLine() ;

		}

		System.out.println("Thanks for testing, goodbye!");
		scnr.close();
	}

}