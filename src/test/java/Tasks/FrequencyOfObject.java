package Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class FrequencyOfObject {
/*
 Write a return method that accepts an String 
 ArrayList list A  and  a String variable B, and the 
 returns the total number of appearance of string B in the ArrayList A.

 

EX:

if   ArrayList cars ===> {"Toyota", "BMW", "bMw", "TOYOTA",
 "ToYoTa", "Tesla", "TESLA", "tEsLa" };

 

Frequency ( cars,  "toyota")  ===>  returns 3

Frequency ( cars, "BMW") ===> returns  2 
 
 */
	
	public static void main(String[] args) {
		
		ArrayList <String> cars = new ArrayList<>();
		cars.addAll(Arrays.asList("Toyota", "BMW", "bMw", "TOYOTA",
 "ToYoTa", "Tesla", "TESLA", "tEsLa","tEsla"));
		System.out.println(Frequency(cars, "tesla"));
		
	}
	public static int Frequency ( ArrayList<String> A, String B) {
		
		int count =0;
		for (int i = 0; i<A.size();i++) {
			if(A.get(i).equalsIgnoreCase(B)) {
				count++;
			}
		}
		
		return count;
	}
}
