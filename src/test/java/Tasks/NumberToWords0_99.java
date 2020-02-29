package Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class NumberToWords0_99 {
public static void main(String[] args) {
	
	
	
/*
 Write a java program that can converts the number
  between 0~ 99  to words

Ex: 

input:  89

out put: Eighty nine

 

input: 75

output:  Seventy five
 	
 */

	
	Scanner in = new Scanner(System.in);
	System.out.println("Enter digits: ");
	int inD = in.nextInt();
	
	String [] dig = {"zero","one","two","three","four","five","six",
			"seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen",
			"eigthy","ninety"};
	String [] digT = {"dont use","dont use","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};

	if(inD<20) {
	System.out.println(dig[inD]);	
	}else if(inD>20&&inD<100) {
		String str = ""+inD;
		String newD []=str.split("");
		int i1 = Integer.parseInt(newD[0]);
		int i2 = Integer.parseInt(newD[1]);
		System.out.println(digT[i1]+" "+dig[i2]);

	} else {System.out.println("Oops");}
	
	
}


}
