package Mentoring;

public class SeventhTaskPolindrome {
	public static boolean PolindromeMethod(String str) {
		boolean result = false;
		StringBuilder reverseB = new StringBuilder(str);
		reverseB.reverse();
		String reverse = reverseB.toString();

		reverse = reverse.replace(" ", "");
		str = str.replace(" ", "");

		if (reverse.equalsIgnoreCase(str)) {
			result = true;
		} else {
			result = false;
		}
		System.out.println("Expected :"+str+"\nActual: "+reverse);

		return result;

	}

	public static void main(String[] args) {
		System.out.println(PolindromeMethod("Nu rses Run"));
	}
}
