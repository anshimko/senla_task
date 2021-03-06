package com.senla.task02;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		System.out.println("Please, enter two integer numbers");

		try (Scanner scan = new Scanner(System.in)) {

			int numberOne = scan.nextInt();
			int numberTwo = scan.nextInt();

			int nok = nok(numberOne, numberTwo);
			int nod = nod(numberOne, numberTwo);

			System.out.println("nok = " + nok + ", nod = " + nod);

		} catch (Exception e) {
			System.out.println("You did enter an integer number incorrectly");
		}
		
	}

	private static int nok(int x, int y) {
		return (x * y) / nod(x, y);
	}

	private static int nod(int x, int y) {
		if (y == 0)
			return Math.abs(x);
		return nod(y, x % y);
	}
}
