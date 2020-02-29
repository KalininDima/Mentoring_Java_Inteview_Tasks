package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class UniqueCharsInArrays {
	public static void main(String[] args) {

		System.out.println("===================");

		int[] ArrayOne = new int[] { 1, 3, 7, 11, 61, 314, 5, 1, 4, 14, 11 };
		int[] ArrayTwo = new int[] { 5, 2, 2, 4, 14, 0, 11, 7, 0, 12, 13, 1 };
		
		ArrayList<Integer> NotRepeatsFirst = new ArrayList<>();
		ArrayList<Integer> NotRepeatsSecond = new ArrayList<>();
		
		int count = 0;
		
		for (int i = 0; i < ArrayOne.length; i++) {
			for (int j = 0; j < ArrayTwo.length; j++) {
				if (ArrayOne[i] != ArrayTwo[j]) {
					++count;
				}
			}
			if (count == ArrayTwo.length) {
				NotRepeatsFirst.add(ArrayOne[i]);
			}
			count = 0;
		}

		for (int i = 0; i < ArrayTwo.length; i++) {
			for (int j = 0; j < ArrayOne.length; j++) {
				if (ArrayTwo[i] != ArrayOne[j]) {
					++count;
				}
			}
			if (count == ArrayOne.length) {
				NotRepeatsSecond.add(ArrayTwo[i]);
			}
			count = 0;
		}

		System.out.println(Arrays.toString(ArrayOne) + "\n" + Arrays.toString(ArrayTwo));

		ArrayOne = new int[NotRepeatsFirst.size()];
		for (int i =0;i<ArrayOne.length;i++) {
			ArrayOne[i] = NotRepeatsFirst.get(i);
		}
		
		ArrayTwo = new int[NotRepeatsSecond.size()];
		for (int i =0;i<ArrayTwo.length;i++) {
			ArrayTwo[i] = NotRepeatsSecond.get(i);
		}


		System.out.println("-------------");
		System.out.println(Arrays.toString(ArrayOne) + "\n" + Arrays.toString(ArrayTwo));
		System.out.println("==============");

	}

}
