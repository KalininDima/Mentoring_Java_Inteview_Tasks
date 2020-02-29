package Tasks;

public class MethodsWithStringExtractNumberFromStringMyRepl {
	 public static String extractNum(String s) {
		    String newS = "";
		    for (int i = 0;i<s.length();i++){
		      if (Character.isDigit(s.charAt(i))){
		        newS+=""+s.charAt(i);
		      }
		    }
		return newS;
		  }
	 
}
