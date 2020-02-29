package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayAscendingOrder {

	public static ArrayList<Integer> findMin(ArrayList<Integer> a) {

		int min =Integer.MAX_VALUE;
		for (int i=0;i<a.size();i++) {
		for(int each: a) {

		a.set(i, Math.min(min, each));
		
		}
		}
		return a;

		}



	public static void main(String[] args) {
		
		ArrayList<Integer> ar = new ArrayList<>(Arrays.asList(4,3,4,5,6,6,7,2,2,2,1,9,1));
		
		System.out.println(findMin(ar));
		
		/*
		int arr = Integer.MAX_VALUE;
		String arrs = "";
		for (int each : ar) {
			
			arr=Math.min(arr,each);
			 arrs += ""+arr;
		}

		System.out.println(arrs);
		*/
	}

}
