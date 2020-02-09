package InterviewQuestions;

public class StringSameLetters {
public static void main(String[] args) {
	
	/*
	 * Write a return method that check 
	 * if a string is build out of the same
	 *  letters as another string.
	 */
			String str = "dimar";
			String str2 = "madiw";
			String check = "";
			
			boolean result = true;
			
			if(str.length()!=str2.length()) {
				System.out.println(result = false);
			} else {
				
				for (int i = 0;i<str.length();i++) {
					
					for (int j = 0;j<str.length();j++) {
							
				if(str.charAt(i)==str2.charAt(j)) {
					check +=""+str.charAt(i);
					
				}
					}
				}
				if (check.length()==str2.length()) {
					System.out.println(result=true);
				} else {
					System.out.println(result = false);
				}
			}
			
			
			
	
	
	
}
}
