package InterviewQuestions;

import java.util.Arrays;

public class MoveZerosInArray {
	
	public static void MoveZerosArray(int [] I) {

	int [] R = new int[I.length];
	int r=0;
	for (int i=0;i<R.length;i++) {
		
		if (I[i]!=0) {
			R[r]=I[i];
			r++;
		
		
		}
	}
	
	System.out.println(Arrays.toString(R));
	
	}
	
	public static void main(String[] args) {
		int [] I = new int[] {0,0,8,0,5,9,2};
		MoveZerosArray(I);
	}
}
