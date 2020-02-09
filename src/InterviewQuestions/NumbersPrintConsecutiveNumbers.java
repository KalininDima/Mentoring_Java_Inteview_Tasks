package InterviewQuestions;
/*
 * Write a function:

that, given a positive integer N, 
prints the consecutive numbers from 1 to N,
 each on a separate line. However, any number
 divisible by 2, 3 or 5 should be replaced by 
the word Codility, Test or Coders respectively.
If a number is divisible by more than one of the
numbers: 2,3 or 5, it should be replaced by a 
concatenation of the respective words Codility,
 Test and Coders in this given order. 
For example, numbers divisible by both 2 and 3
should be replacée by CodilityTest and numbers
 divisible by all three numbers: 2,3 and 5, 
 should be replaced by CodilityTestCoders.
 */
public class NumbersPrintConsecutiveNumbers {

	public static void ConsecutiveN (int N) {
		String two = "Codility";
		String three = "Test";
		String five = "Coders";
		int count = 0;
		String result="";
		for (count =1;count<N;count++) {
		if (count%2==0&&count%3==0&&count%5==0) {
			result+=two+three+five+"\n";
		} else if(count%2==0&&count%3==0) {
			result+=two+three+"\n";
		} else if (count%2==0&&count%5==0) {
			result += two+five+"\n";
		} else if (count %3==0&&count%5==0) {
			result+=three+five+"\n";
		} else if (count%2==0) {
			result+=two+"\n";
		}else if (count%3==0) {
			result+=three+"\n";
		}else if (count%5==0) {
			result += five+"\n";
		} else {
			result+=count+"\n";
		}
		}
	System.out.println(result);
	}
	public static void main(String[] args) {
		ConsecutiveN(90);
	}
}
