package Tasks;

import java.util.ArrayList;

public class MethodsWithArrayList2Times {
public static void main(String[] args) {
	/*
	Create a method that:

		is called twoTimes
		returns a new ArrayList of Integers
		takes in a single parameter - an ArrayList of Integers

		This method should create a new ArrayList of Integers that contains every value of the ArrayList parameter repeated twice.

		For example, if the parameter is
		(1,5,3,7)
		The method should return a new ArrayList of Integers with
		(1,1,5,5,3,3,7,7)
	
	*/
	
	ArrayList <Integer> list= new ArrayList <>();
			list.add(1);
			list.add(2);
			list.add(3);
			list.add(4);
			list.add(5);
	ArrayList<Integer> list2 = new ArrayList<>();
	list2.addAll(list);
	for (int i=0;i<list2.size();i+=2) {
	
		list2.add(i,list2.get(i));
	}
	System.out.println(list2);
	
	
}
	
	
	
	
}
