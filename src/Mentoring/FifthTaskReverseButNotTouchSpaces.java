package Mentoring;

import java.util.ArrayList;
import java.util.Arrays;

public class FifthTaskReverseButNotTouchSpaces {
	
	/*
	 * The task is mean that we nned reverse the string but keep the spaces on the same indexes in new String
	 * EX: 	 D  i ma
	 * Need: a  m iD
	 * Not:  am i  D
	 */
	public static void ReverseNotTouchSpaces(String str) {

		//create the Array list with Integer data
		ArrayList<Integer> listofspaces = new ArrayList<>();
		
		//create the for loop with condition the length of main String str
		
		for (int i = 0; i < str.length() - 1; i++) {
			
			//create if statement and check that if one of the index equal space, go inside
			if ((""+str.charAt(i)).equals(" ")) {
				
				//And save into the list that index which have space from main String str
				listofspaces.add(i);
			}
		}
		
		//then reassign str variable using removeAll method, and remove all spaces from that String variable
		str=str.replaceAll(" ","");
		
		//Create new String result
		String result="";
		
		//Create for loop with int i as initializer where value is length of main String str -1
		//and condition i must be high or equal zero, and iterator i--, 
		//that means that we are going from end of the value to the begigining
		for (int i = str.length() - 1; i >= 0; i--) {
			
			//Create inside that loop another one, initializer int l will be 0, condition l should be less then length of 
			//ArrayList where we saved indexes with spaces from our main String
			for (int l = 0; l < listofspaces.size(); l++) {
				
				//the inside the loop create the if statement  with condition
				//if array list has the value(that values equals to the indexes of all spaces from our main String str)
				//so if one of that value equal to to the length of our new String result, go inside the if statement
				if (listofspaces.contains(result.length())) {
					
					//and add the " " to the new String variable result
					result += " ";
				
				}
				//if our if statement false go inside the else statement 
				else {
					
					//and the letter from our main String str to the new String result
					//Reminder: we are going from the end of the main String, and we are did remove all spaces from main String
					//but we know where were spaces in that String , because we saved their indexes in the our ArrayList<Integer>.
					result += str.charAt(i);
					
					//then break, exit from current loop and come back to first loop
					break;
				}
			}
		}
		
		//Done, print the result
		System.out.println(result);

		
	}
	public static void main(String[] args) {
	
		String str = "Tomorow    is   in  your handes";
		ReverseNotTouchSpaces(str);
		System.out.println("How should be:");
		System.out.println("sednahr    uo   yn  isiw oromoT");
	}


}
