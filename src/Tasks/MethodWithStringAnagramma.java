package Tasks;

import java.util.Arrays;

public class MethodWithStringAnagramma {
	public static void main(String[] args) {
		

		System.out.println(isAnagram("listen", "silent"));

	}

	public static boolean isAnagram(String word1, String word2) {
		boolean result;
		/*
		String check = "";

		if (word1.length() == word2.length()) {
			for (int i = 0; i < word1.length(); i++) {
				for (int j = 0; j < word1.length(); j++) {
					if (("" + word1.charAt(i)).equalsIgnoreCase("" + word2.charAt(j))) {
						check += "" + word1.charAt(i);
					}
				}
			}
			if (check.equalsIgnoreCase(word1) || check.equalsIgnoreCase(word2)) {
				result = true;
			} else {
				result = false;
			}

		} else {
			result = false;

		}
*/
		String w1 [] = word1.split("");
		String w2 [] = word2.split("");
		Arrays.sort(w1);
		Arrays.sort(w2);
		if(Arrays.toString(w1).equalsIgnoreCase(Arrays.toString(w2))) {
			result=true;
			
		} else { 
			result=false;
		

	}
		return result;
}
}
