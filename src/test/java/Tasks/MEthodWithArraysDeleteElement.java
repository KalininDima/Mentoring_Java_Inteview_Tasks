package Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class MEthodWithArraysDeleteElement {
public static void main(String[] args) {
	int arr1[] = {4,3,3,3,35,6,4};
	int e = 4;
	
	
	System.out.println(Arrays.toString(deleteR(arr1,e)));
}

public static int[] deleteR (int arr[], int element) {
	ArrayList<Integer> arrN =new ArrayList<>();
	
	
	for (int i = 0; i<arr.length;i++) {
		if(arr[i]!=element) {
		arrN.add(Integer.valueOf(arr[i]));
		}
		
	}
	int [] newArr =new int [arrN.size()];
	for (int i = 0;i<newArr.length;i++) {
		newArr[i]+=arrN.get(i);
	}
	
	return newArr;
}
}
