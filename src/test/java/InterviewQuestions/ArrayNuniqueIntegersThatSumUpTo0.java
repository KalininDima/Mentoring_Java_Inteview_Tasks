package InterviewQuestions;

import java.util.Arrays;
import java.util.Random;

/*
 * Write a function:

that, given an integer N (1 < N < 100), 
returns an array containing N unique integers that sum
 up to 0. The function can return any such array.
 For example, given N = 4, the function could return
 [1,0, -3,2] or [-2,1, -4,5]. The answer [1, -1,1,3]
 would be incorrect (because value 1 occurs twice).
  For N = 3 one of the possible answers is [-1,0,1]
  (but there are many more correct answers).
 */
public class ArrayNuniqueIntegersThatSumUpTo0 {
public static int[] N (int n) {
	int array [] = new int [n];
	int last = 0;
	for (int i =0;i<array.length;i++) {
		if(i==array.length-1) {
			array[i]=-last;
			break;
		}
		array[i] = ((int)(Math.random() * 100) - 50);
		last += array[i];
		
	}
	
	return array;
	
}
	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(N(9)));
		/*
		int arr[] = new int [4];
		arr[0] = 44;
		arr[1]=-5;
		arr[2] = 15;
		int count = arr[0]+arr[1]+arr[2];
		arr[3] = -count;
		
		System.out.println(Arrays.toString(arr));
		*/
		
		/*
		Random r = new Random();
		int min = -100;
		int max = 100;
		int use = r.nextInt(min-max);
		System.out.println(use);
		*/
		
	}
	

	
	
}
