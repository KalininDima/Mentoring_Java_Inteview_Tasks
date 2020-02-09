package InterviewQuestions;

public class DivideWithoutOperators {

	
	public static void Divide(int a, int b) {
		
		int result =0;
		

	
		if(b==0||a==0) {
			System.out.println("You cant divide on zero");
		}
		
		while(a>=b) {
			a-=b;
			result++;
			
		}
		System.out.println(result+" remaining "+a);
	
		
		
	}
	/*
	public static void Divide(int a, int b) {
		int result = 0;
		if (b == 0||a==0) {
			System.out.println("you cant divide on zero");
		}
			while (a >= b) {
				a -= b;
				result++;
			}
		System.out.println(result +" remainder is "+a);
	}
*/
	public static void main(String[] args) {
		
	Divide(12,95);


	}
}
