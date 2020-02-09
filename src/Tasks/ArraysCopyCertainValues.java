package Tasks;

import java.util.Arrays;

public class ArraysCopyCertainValues {
	/*
	 * Given a String array arr with the following elements ["zero", "one",
	 * "two","three","four"]
	 * 
	 * Create another array fewValues and copy words that have letter "e" in them
	 * 
	 * You need to know how many element contain "e" and create array accordingly
	 * 
	 * Values in fewValues array need to be["zero", "one","three"]
	 * 
	 * Examples: arr -> ["aa", "be", "lol", "lel", "oreo"] fewValues -> ["be",
	 * "lel", "oreo"]
	 */

	public static void main(String[] args) {
		System.out.println("-----EXAMPLE RUN ---------");
		String[] numbers = { "zero", "one", "two", "three", "four" };
		System.out.println(Arrays.toString(getWithE(numbers)));

	}

	public static String[] getWithE(String[] arr) {

		// TODO : YOUR CODE GOES HERE ----------------------
		String s1 = "";
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].contains("e")) {
				s1 += arr[i] + " ";
			}
		}
		String fewValues[] = s1.split(" ");

		// YOUR CODE ENDS HERE -----------------------

		return fewValues;
	}
}
