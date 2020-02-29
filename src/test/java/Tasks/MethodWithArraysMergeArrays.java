package Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodWithArraysMergeArrays {

	
	/*
	 mergR merges two arrays into one.
	it gets two int arrays and returns an int array

	 */
/*	
	public static int[] mergR(int[] a,int[] b) {
	   
	   int arr [] = new int [a.length+b.length];
	   for (int i = 0;i<a.length;i++) {
		   arr[i]+=a[i];
	   }
	   for ( int j = b.length; j < arr.length; j++) {
		   arr[j]+=b[j];
	   }
System.out.println(Arrays.toString(arr));
	    
	    return arr;
	    
	  }//end mergR
	  */
	  public static void main(String[] args) 
	  {
	   int [] one = {5,4,3,2,1};
	   int [] two = {6,7,8,9,10,11};
	    int count = 0;
	  
	   int arr [] = new int [one.length+two.length];
	   
	   for (int i = 0;i < one.length;i++) {
		   arr[count]+=one[i];
		   count++;
	   }
	   for ( int j =0 ; j < two.length; j++) {
		   arr[count]+=two[j];
		   count++;
	   }
	  
	   
System.out.println(Arrays.toString(arr));
	
	   
	  }
	}