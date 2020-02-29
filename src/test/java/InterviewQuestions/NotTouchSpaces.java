package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class NotTouchSpaces {
	public static String ReverseStringNotTouchSpaces(String str){
		String result = "";
		ArrayList<Integer> listofspaces = new ArrayList<>();
		for (int i = 0; i < str.length() - 1; i++) {
			if (("" + str.charAt(i)).equals(" ")) {
				listofspaces.add(i);
			}
		}
		str= str.replaceAll(" ", "");

		for (int i = str.length() - 1; i >= 0; i--) {
			for (int l = 0; l < listofspaces.size(); l++) {
				if (listofspaces.contains(result.length())) {
					result += " ";
				} else {
					result += str.charAt(i);
					break;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		String str = "Tom  orow  isin your h and es p";

		System.out.println(ReverseStringNotTouchSpaces(str));


	}

}
