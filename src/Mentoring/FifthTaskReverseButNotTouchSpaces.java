package Mentoring;

import java.util.ArrayList;
import java.util.Arrays;

public class FifthTaskReverseButNotTouchSpaces {
	public static void ReverseNotTouchSpaces(String str) {

		ArrayList<Integer> listofspaces = new ArrayList<>();
		for (int i = 0; i < str.length() - 1; i++) {
			if ((""+str.charAt(i)).equals(" ")) {
				listofspaces.add(i);
			}
		}
		
		str=str.replaceAll(" ","");
		String result="";
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
		System.out.println(result);

		
	}
	public static void main(String[] args) {
	
		String str = "Tomorow    is   in  your handes";
		ReverseNotTouchSpaces(str);
		System.out.println("How should be:");
		System.out.println("sednahr    uo   yn  isiw oromoT");
	}


}
