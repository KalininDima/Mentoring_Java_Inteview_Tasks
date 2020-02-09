package InterviewQuestions;

import java.util.Arrays;

public class MoveZerosInArray {
	
	public static void MoveZerosArray(int [] I) {

	int [] R = new int[I.length];
	int IteratorForR=0;
	for (int IteratorForI=0;IteratorForI<R.length;IteratorForI++) {
		
		if (I[IteratorForI]!=0) {
			R[IteratorForR]=I[IteratorForI];
			IteratorForR++;
		
		
		}
	}
	
	System.out.println(Arrays.toString(R));
	
	}
	
	public static void main(String[] args) {
		int [] I = new int[] {0,0,8,0,5,9,2};
		MoveZerosArray(I);
	}
}
