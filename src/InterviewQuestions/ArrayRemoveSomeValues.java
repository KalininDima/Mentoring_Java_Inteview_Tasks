package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayRemoveSomeValues {
	/*
	 * Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater
	 * than 100.
	 */

	public static ArrayList<Integer> Remove(ArrayList<Integer> list) {

		ArrayList<Integer> list2 = new ArrayList<>();
		
		for (int each : list) {
			if(each<100)
			list2.add(each);
		}
		
		return list2;
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(
				Arrays.asList(1, 2, 3, 4, 2, 3900, 400, 300, 22, 222, 333, 541, 13, 44, 313, 213, 43, 12, 21));

		System.out.println(Remove(list));
	}
}
