package Mentoring;

import java.util.Arrays;

public class FirstTaskArrayNuniqueIntegersThatSumUpTo0 {

	/*
	 * Write a function:
	 * 
	 * that, given an integer N (1 < N < 100), returns an array containing N unique
	 * integers that sum up to 0. The function can return any such array. For
	 * example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
	 * The answer [1, -1,1,3] would be incorrect (because value 1 occurs twice). For
	 * N = 3 one of the possible answers is [-1,0,1] (but there are many more
	 * correct answers).
	 */

	// creating the method with Int as parameter
	public static int[] N(int n) {

		// creating the int array with and setup the length of Array by n value.
		int array[] = new int[n];

		// creating int variable as will have amount of value each indexes in array.
		int finalValue = 0;

		// creating for loop;
		for (int i = 0; i < array.length; i++) {

			// creating if statement, we are waiting when i will be equal last index of the
			// our array.
			if (i == array.length - 1) {
				// if its true , we are assigning to last index negative value of finalVariable
				array[i] = -finalValue;
				break;
			}
			// if false, we are asiging to each index in array random digit from -10 to 10
			array[i] = ((int) (Math.random() * 20) - 10);

			// then we are adding value of each index to our variable
			finalValue += array[i];
		}
		// return our array
		return array;

	}

	public static void main(String[] args) {

		//call method N in main method and assign there length of array using parameter of the method N.
		System.out.println(Arrays.toString(N(8)));

	}

}
