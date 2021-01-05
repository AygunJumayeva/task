package task;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.HashMap;
import java.util.Map;


public class jUnitTests {

	@Test
	//checks if the longest expression in the input (divided by whitespace (" ")) matches the expectations
	public void testLongestString() {
		Map<String, Integer> expected = new HashMap();
		Calculation obj = new Calculation();
		expected.put("State", 5);
		Map<String, Integer> actual = obj.longestWords("New York State");
		assertTrue(expected.equals(actual));
	}
		
	@Test	
	//process the empty input and checks if the result matches the expectation which is -  "",0
	public void testEmpty() {
		Map<String, Integer> expected = new HashMap();
		Calculation obj = new Calculation();
		expected.put("", 0);
		Map<String, Integer> actual = obj.longestWords("");
		assertTrue(expected.equals(actual));
	}
	
	@Test	
	//process the input which contains only 1 word and checks if the result matches the expectation which is that word itself only
	public void testOneWord() {
		Map<String, Integer> expected = new HashMap();
		Calculation obj = new Calculation();
		expected.put("word", 4);
		Map<String, Integer> actual = obj.longestWords("word");
		assertTrue(expected.equals(actual));
	}
	
	@Test	
	//process the input which has 2 or more words with the same longest length and checks the expectation matches
	public void test2SameLength() {
		Map<String, Integer> expected = new HashMap();
		Calculation obj = new Calculation();
		expected.put("York", 4);
		expected.put("Best", 4);
		Map<String, Integer> actual = obj.longestWords("New York Best ");
		assertTrue(expected.equals(actual));
	}
	
	@Test	
	//process the input which has all words with the same length and checks if  expectation matches
	public void testAllSameLength() {
		Map<String, Integer> expected = new HashMap();
		Calculation obj = new Calculation();
		expected.put("New", 3);
		expected.put("car", 3);
		expected.put("and", 3);
		expected.put("new", 3);
		expected.put("oil", 3);
		Map<String, Integer> actual = obj.longestWords("New car and new oil");
		assertTrue(expected.equals(actual));
		}
	
	@Test	
	//process the input  which consists of 1 blank space and matches the expectation: 1, " "
	public void testBlankSpace() {
		Map<String, Integer> expected = new HashMap();
		Calculation obj = new Calculation();
		expected.put(" ", 1);
		Map<String, Integer> actual = obj.longestWords(" ");
		assertTrue(expected.equals(actual));
		}
	}

