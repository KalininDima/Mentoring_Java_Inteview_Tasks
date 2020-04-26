package InterviewQuestions;

public class Polindrome {
	public static boolean PolindromeMethod(String str) {
		
		//crate boolean variable with false value
		boolean result = false;
		
		//Using the following sintax we are assign value of the String str as the value StringBuilder object
		StringBuilder reverseB = new StringBuilder(str);
		
		//Using reverse method from StringBuilder to reverse value of that StringBuilder
		reverseB.reverse();
		
		//assign value of StringBuilder to classic String
		String reverse = reverseB.toString();

		//the use replace method from reverse String variable, to replace (" " on "")
		reverse = reverse.replace(" ", "");
		
		//the use replace method from str String variable, to replace (" " on "")
		str = str.replace(" ", "");

		//check that reverse  String equals ignore case with main String str
		if (reverse.equalsIgnoreCase(str)) {
			//if true , assign true to boolean result
			result = true;
		} else {
			
			//if false , assign false value to boolean result 
			result = false;
		}
		
		//print Expected and Actual results
		System.out.println("Expected :"+str+"\nActual: "+reverse);

		//return the boolean variable
		return result;

	}

	public static void main(String[] args) {
		//call the method with string value in parameters 
		System.out.println(PolindromeMethod("Nu rses Run"));
	}
}
