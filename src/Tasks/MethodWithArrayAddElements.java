package Tasks;

import java.util.Arrays;

public class MethodWithArrayAddElements {
public static void main(String[] args) {
	
	/*
	 Method addElements accepts 2 int arrays 
	 and adds each element value of two arrays 
	 and returns a new array. You can assume that 
	 each array has 5 elements

addElements(new int[][10, 40, 50, 3, 1],
            new int[][11, 0, 500, 44, 1101]);
--------
return array after adding values in the arrays:
             [21, 40, 550, 47, 1102]

	 */
	int [] one = {1,4,2,7,5};
	int [] two = {5,5,5,7,8};
	
	System.out.println(Arrays.toString(addElements(one,two)));
}

public static int[] addElements(int[] ints1, int[] ints2) {
    
    int [] newint = new int [ints1.length];
     for (int i = 0 ; i <newint.length;i++ ) {
    	 newint[i]=ints1[i]+ints2[i];
     }
    return newint;
}
}
