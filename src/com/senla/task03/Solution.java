package com.senla.task03;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)) {
			
			System.out.println("Please, enter some sentence");

			String sentence = scan.nextLine();
			String[] words = sentence.split(" ");
			
			System.out.println("Count of words are " + words.length);
			
			Arrays.stream(words)
				.sorted().map(x -> x.substring(0, 1).toUpperCase() + x.substring(1))
				.forEach(System.out::println);

		}
	}
}
