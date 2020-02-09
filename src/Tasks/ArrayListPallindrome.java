package Tasks;

public class ArrayListPallindrome {
public static void main(String[] args) {
	
	/*Palindrome is a word, phrase, or sequence that 
	 * reads the same backward as forward, e.g., madam or 
	 * nurses run.

	So method isPalindrome checks that and returns 
	true if check is palindrome and false if it is not.

	- make your conditions case insensitive.  ex: 
	Civic and civic are both palindromes
	- make your conditions space insensitive.  Race car 
	is a palindrome even though there is space in between.
*/	
	

System.out.println(isPalindrome("Nurses Run"));


}

public static boolean isPalindrome(String check) {
	String rev = "";
	
	for (int i = check.length()-1;i>=0;i--) {
		rev+=""+check.charAt(i);
	}
	rev = rev.replace(" ", "");
	check = check.replace(" ", "");
	boolean result;
	System.out.println(rev);
	if (rev.equalsIgnoreCase(check)) {
		result=true;
	} else {
		result=false;
	}
	
	return result;
}

}
