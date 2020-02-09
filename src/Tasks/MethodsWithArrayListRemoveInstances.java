package Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodsWithArrayListRemoveInstances {
/*
 This method gets an arraylist of Integers and a 
 number(Integer).it returns an arraylist.

It removes any instance of the number it gets from the arraylist.
 */
	public static ArrayList<Integer> removeInst(ArrayList<Integer> r,Integer n) 
	  {
		while(r.contains(n) ) {
				r.remove(n);
		}
	   return r;
	  }
	  
	  
	  public static void main(String[] args)
	  {
	  
	    ArrayList<Integer>  arr = new ArrayList<>();
	    Integer[] nums = new Integer[]{1,1,14,21,2,1,3};
	    arr.addAll(Arrays.asList(nums));
	    
	    System.out.print(removeInst(arr,1));
	   
	    
	  }//end main
	}