package Mentoring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class SortMapByValue {
	public static void main(String[] args) {

		
		
		/*
		 * How can we sort Map by value .
		 */

		// Create the MAP data structure , call constructor from HashMap Class.
		//Data type: Key - Integer, Value - String
		Map<Integer, String> map = new HashMap<Integer, String>();

		// Adding keys and values by using put method, map.put(key, valueOfThatKey)
		map.put(1, "c");
		map.put(4, "a");
		map.put(5, "f");
		map.put(2, "e");
		map.put(3, "b");
		map.put(11, "a");
		map.put(6, "g");
		map.put(7, "z");
		map.put(8, "d");
		map.put(100, "aa");

		// create the Array list Data Type String
		ArrayList<String> listN = new ArrayList<String>();

		// Inside the current for each loop create on more for each Integer loop(Integer
		// because our keys from map are Integer)
		// and returning the all keys from our map
		for (Integer each : map.keySet()) {

			// Then we are adding the value of each key to the list by using map.get(each) method
			// each - its key
			// map.get(each) - returns value of the key
			listN.add(map.get(each));
		}

		// print the list with values
		System.out.println("The list \n" + listN);

		// sort list by ascending order
		Collections.sort(listN);

		// print the list to see sorted values
		System.out.println("Sorted list\n" + listN);

		// Creating LinkedHashMap , with KEY Integer and VALUE String.
		// Why LinkedHashSet? Because LinkedHashSet saved the order of the data which we
		// are adding.
		Map<Integer, String> Linked = new LinkedHashMap<Integer, String>();

		// Creating for each String loop(because value of the list is String), and put
		// the loop our list
		// (Where is already we have sorted String values of KEYS of our MAP)
		for (String each : listN) {

			// Inside the current for each loop create on more for each Integer loop(Integer
			// because our keys from map are Integer)
			// and returning the all keys from our map
			for (Integer each1 : map.keySet()) {

				// create if statement and put folowing condition:
				// each(It is already SORTED list which has the value of our KEYS from MAP)
				// equal to value of key?
				// That means that we are looking for the key of the first value which we want
				// to add in our LinkedHashMap.
				// When its true:
				if (each == map.get(each1)) {
					// We are adding to LinkedHashMap key(each1) and value to that key (each)
					Linked.put(each1, each);
				}
			}
		}
		// Done , we have added sorted values and their keys to LinkedHashMap by order.
		// We are did sort the map by values of the keys.

		// Non sorted values of map
		System.out.println("Non sorted values of map\n" + map);
		// Sorted values of map
		System.out.println("Sorted values of map\n" + Linked);
		
		System.out.println("===================");
		
		int [] listOne = new int[] {1,3,7,11,61,314,5,1,4,14,11};
		int [] listTwo = new int[] {5,2,2,4,14,0,11,7,0,12,13,1};
		ArrayList<Integer> NotRepeatsFirst = new ArrayList<>();	
		ArrayList<Integer> NotRepeatsSecond = new ArrayList<>();
		
		for (int i = 0;i<listOne.length;i++) {
			
			for (int j =0;j<listTwo.length;j++) {
				
				if(listOne[i]==listTwo[j]) {
				NotRepeatsFirst.add(listOne[i]);
				

					break;
				}
			}
			
			
			
		}
		int [] resultOne = new int[NotRepeatsFirst.size()];
		
		for (int i =0;i<resultOne.length;i++) {
			if(!NotRepeatsFirst.contains(listOne[i]))
			resultOne[i]=NotRepeatsFirst.get(i);
		}
		System.out.println(Arrays.toString(resultOne));
		System.out.println("-------------");
		System.out.println(listOne+"\n"+listTwo+"\n"+NotRepeatsFirst);
		System.out.println("==============");

	}

}
