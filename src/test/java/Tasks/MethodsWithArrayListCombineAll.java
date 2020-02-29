package Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodsWithArrayListCombineAll {
	
/*
Create a static method that:
is called combineAL
returns an ArrayList
takes two parameters: an ArrayList of Strings called wordList1, 
and an ArrayList of Strings called wordList2

This method should create a new ArrayList of Strings, add 
all the words (in order) from wordList1, then add all the
words (in order) from wordList2.  In other words, it is
combining all the elements from the two parameters.
 */
	
	
		
	public static ArrayList<String> arr (ArrayList <String> wordList1, ArrayList<String> wordList2){
		ArrayList<String> combineAL = new ArrayList<String>();
		combineAL.addAll(wordList1);
		combineAL.addAll(wordList2);
		
		return combineAL;
	}
	public static void main(String[] args) {
		
	
		
	}
}
