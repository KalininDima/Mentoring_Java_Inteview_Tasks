package Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class AsiyaClass {
public static void main(String[] args) {
	
	for (int i = 100;i>=97;i--) {
		System.out.print(i+" ");
	}
	
	System.out.println();
	
	for (int i = 1 ;i<=10;i++) {
		if(i%2==0) {
			System.out.print(i+" ");
		}
	}
	System.out.println();
	for (int i=10;i>=0;i--) {
		if(i%2!=0) {
			System.out.print(i+" ");
		}
	}
	
Scanner in = new Scanner(System.in);
	String text = in.nextLine();
	int l = text.length()-1;
	
	for (int i = l;i>=0;i--) {
		System.out.print(text.charAt(i));
	}
	
	System.out.println();
	
	int [] num = {100,45,97,33};
	System.out.println(num[1]);
	
	String sentence = "learn huy learn yo";
    
    String[] arr = sentence.split("learn");
System.out.println( Arrays.toString(arr) ); 
	
}
}
