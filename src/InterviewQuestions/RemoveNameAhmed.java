package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveNameAhmed {

	public static ArrayList<String> Ahmed(ArrayList<String> list) {
		
		/*
		 * list.removeAll( Arrays.asList("Ahmed"));

		 */
		
	
		while (list.contains("Ahmed")) {

			list.remove("Ahmed");

		}
		return list;
	}

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));

		System.out.println(Ahmed(list));

	}
}
