package task;

import java.util.HashMap;
import java.util.Map;

public class Calculation {
	/*
	 * 
	 * Creating the method named "longestWords". In this method, I am creating new HashMap named "result".
	 * It will store the longest word/words and its/their length in this HashMap per "key and value" concept. 
	 * This method starts with 1 major condition: if the input consists of 1 blank space, then the method printing (1, " "). 
	 * Otherwise it goes to else condition following in below steps: 
	 * 1.First I need to extract each word from input using split method and
	 * populating them in array of Strings named as "newArray";
	 * 2.Then I need to create a temporary integer variable (in this case "max"), that we will help
	 * in comparing each element's length;
	 * 3.Looping through the each element of the array named "newArray" helps me to update the value of "max";
	 * 4.If the length of the element is longer than "max", then "max" updates its value to longer
	 * element's value ;
	 * 5.Also need to clear the map in case, if "max" changes its value;
	 * 6.As a result this method adds the element/elements with the longest value and its/their length to the HashMap;
	 * 7.There is also one more condition block which is executed in case there are several longest words with the same length;
	 * 8.In conclusion, this method returns the HashMap named "result" with new (key, value) pairs.
	 * 
	 */
	public Map<String, Integer> longestWords(String input) {
		Map<String, Integer> result = new HashMap();
		if (input.contains(" ") && input.length() == 1) {
			result.put(" ", 1);
		} else {
			String[] newArray = input.split(" ");
			int max = 0;
			for (int i = 0; i < newArray.length; i++) {
				if (newArray[i].length() > max) {
					max = newArray[i].length();
					result.clear();
					result.put(newArray[i], max);
				} else if (newArray[i].length() == max) {
					result.put(newArray[i], max);
				}
			}
		}
		return result;
	}
}