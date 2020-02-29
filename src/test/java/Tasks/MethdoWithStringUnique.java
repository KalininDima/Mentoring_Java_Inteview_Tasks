package Tasks;

public class MethdoWithStringUnique {
public static void main(String[] args) {
	
	/*uniqueChars is a method that you will 
	 * code now, should be able to accept any 
	 * string in the world and return unique 
	 * characters from the parameter.	
	 */
	String text ="wooden-spoon";
	String U = "";
	
	for (int i =0;i<text.length();i++) {
	if (!U.contains(""+text.charAt(i))) {
		U+=""+text.charAt(i);
	}
	}
	 System.out.println(U);
}


}
