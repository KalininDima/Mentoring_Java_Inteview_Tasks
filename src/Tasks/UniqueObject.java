package Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class UniqueObject {

	/*
	 Write a program that can find the unique objects from an ArrayList

 

Ex: if arrayList is [100, 100, 20, 300, 300, 40, 500, 500]

output:    20   40 
	 */
	
	public static void main(String[] args) {
		
	
	ArrayList <Integer> list = new ArrayList<>();
	list.addAll(Arrays.asList(1,2,3,45,6,6,64,3,32,4));
	int count = 0;
	String U = "";
	
	for (int i =0; i<list.size();i++) {
	
		for (int j =0; j<list.size();j++) {
			if(list.get(i)==list.get(j)) {
				count++;
			}
			
		}
		
		if(count==1) {
			U+=list.get(i)+" ";
		}
		count=0;
		
	} 
	System.out.println(U);
	
	
	}
}
