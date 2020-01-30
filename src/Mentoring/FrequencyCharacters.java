package Mentoring;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyCharacters {

	// First way:
	//create the method with String parameters
	public static void FirstWayMethod(String str) {
		
		//create the int value , we will use it to count the characters
		int count = 0;
		
		//creating the string variable where we save unique characters
		String U = "";

		//create the for loop and condition will be length of our main string where all characters
		for (int i = 0; i < str.length(); i++) {

			//inside the current creating second for loop with same condition as previous.
			for (int j = 0; j < str.length(); j++) {

				//creating if statement and check the one value with all values in same variable, is equal or not
				if (str.charAt(i) == str.charAt(j)) {
					
					//if we found that one value matching with any other values from the variable,
					//it means that we are increasing count variable on 1. Every matching we will increase value of count variable on 1. 
					//even if we have one letter A, it means 1 matching.
					count++;
				}

			}
			
			//when our second loop is finished and we are returning to the first loop, where we creating if statement
			//and then we check our string variable U, doesnt have the letter which we checked before in our second loop.
			//if its true go inside.
			if (!U.contains("" + str.charAt(i))) {
				
				//then assign to String variable U the letter which we checked before and
				//how many times that letter we meet in the main String str. Thats what we saved in count variable
				U+=" "+str.charAt(i) + count;
			}
			
			//Then we need assign zero to count variable, because we will take second 
			//letter and check how many times we will meet it in the String str. If we wount assign a zero, 
			//that means that to results of previous letter will be adding results of new letter
			//EX:if letter A meets 2 times and then we check letter B which we meet 1 time, total value of count will be 3, but we needed 1.
			count = 0;

		}

		//print the result of String U
		System.out.println(U);

	}

	//Creating the method with String as parameters
	public static void SecondWayMethod(String str) {
		// Second way:
		
		//Creating the map , and as KEY Character, and as VALUE Integer, and call constructor from LinkedHashMap(can create and from HashMap,Hashtable)
		Map<Character, Integer> M = new LinkedHashMap<>();

		//we are creating for each loop as Character object and converting main string into char array(use toCharArray method))
		for (Character each : str.toCharArray()) {
			
			//creating if statement with following condition:
			//we will take a key (character) and check does it contain value of each(remind each has EACH value from main string str)
			if (M.containsKey(each)) {
				
				//then we will use an each as KEY, and add(put command) to that KEY VALUE +1, and VALUE we are taking from that KEY M.get(each) 
				//means give a value from that key. Value type Integer, add to that value +1
				M.put(each, M.get(each) + 1);
			
				//that happens only once for each key, because our MAP empty in the beginning
			} else {
				
				//if MAP doesnt have the key (which each) we are adding that KEY 
				//and assigning value to that KEY 1, because at this moment we first time meet that KEY
				M.put(each, 1);
			} 

		}
		
		//Done, print the map
		System.out.println(M);

	}

	public static void main(String[] args) {

		//create main string with characters
		String str = "tqtqettttewfdsfggartw33444YYYY{";
		//Call both methods
		FirstWayMethod(str);
		SecondWayMethod(str);

	}
}