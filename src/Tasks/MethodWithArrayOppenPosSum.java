package Tasks;

import java.util.ArrayList;

public class MethodWithArrayOppenPosSum {
	/*
	Create a static method that:

	is called appendPosSum
	returns an ArrayList of Integers
	takes one parameter: an ArrayList of Integers
		 
	This method should:
	Create a new ArrayList of Integers
	Add only the positive Integers to the new ArrayList
	Sum the positive Integers in the new ArrayList and add the Sum as the last element

	For example, if the incoming ArrayList contains the Integers (4,-6,3,-8,0,4,3),
	the ArrayList that gets returned should be (4,3,4,3,14),
	 with 14 being the sum of (4,3,4,3).  The original ArrayList 
	should remain unchanged.
	*/
	public static void main(String[] args) {
		ArrayList<Integer> r = new ArrayList<>();
		r.add(4);
		r.add(-6);
		r.add(3);
		r.add(-18);
		r.add(4);
		r.add(3);
		r.add(41);
		r.add(-4);
		r.add(0);
	System.out.println(appendPosSum(r));
	}
	
	public static ArrayList <Integer> appendPosSum(ArrayList <Integer> arr){
		int count = 0;
		ArrayList<Integer> arrN = new ArrayList<>();
		for (int i = 0 ; i<arr.size();i++) {
			if(arr.get(i)>0) {
				arrN.add(arr.get(i));
				count+=arr.get(i);
			}
			
		}
		arrN.add(count);
		
		return arrN;
	}
}
