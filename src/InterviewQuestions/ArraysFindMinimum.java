package InterviewQuestions;

public class ArraysFindMinimum {
	
	public static void main(String[] args) {

		int[] arr= {5,4,3,321,4,5,623,2,3,4,4,5,66,6};
		System.out.println(FindMinimum(arr));
	}
public static int FindMinimum(int [] a) {
	int min = Integer.MAX_VALUE;
	for (int each : a) {
		if(each<min) {
			min=each;
		}
	}
	return min; 
}
}
