package task;

import java.util.Map;
import java.util.Scanner;

public class Main {
	
	/*
	 * Using Scanner object to enable dynamic input;
	 * User enters the input when he/she sees this output: "Please enter any sentence or phrase: ";
	 * Creating new String "sentence" variable and assigning input to it;
	 * Object "maximum" is created to call the non-static method;
	 * Assigning result of the method to the HashMap named "result";
	 * Using entrySet to extract both keys and values from the map and to print them as per requirement in the instruction.
	 */

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter any sentence or phrase: ");
		String sentence = input.nextLine();
		Calculation maximum = new Calculation();
		Map<String, Integer> result = maximum.longestWords(sentence);
		for (Map.Entry<String, Integer> entry : result.entrySet()) {
			System.out.println(entry.getValue() + " " + "\"" + entry.getKey() + "\"");

		}
	}
}