package Tasks;

import java.util.Scanner;

public class NumbersOfWords0_999 {
public static void main(String[] args) {
	
	Scanner in = new Scanner (System.in);
	System.out.println("Enter digits: ");
	String [] one_19 = {"zero","one","two","three","four","five","six",
			"seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen",
			"eigthy","ninety"};
	String [] twenty_99 = {"dont use","dont use","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
	
	String [] hundreed_999 = {"dont use", "one hundreed", "two hundreeds", "three hundreeds", "four hundreeds","five hundreeds", "six hundreeds", "seven hundreeds",
			"eight hundreeds","nine hundreeds"};
	int digits = in.nextInt();
	int i1=0;
	int i2=0;
	int i3=0;
	String str1=""+digits;
	String strFor = ""+str1.charAt(1);

	if (digits<20) {
		System.out.println(one_19[digits]);
	} else if (digits>20&&digits<100) {
		String strD1 [] = str1.split("");
		 i1 = Integer.parseInt(strD1[0]);
		 i2 = Integer.parseInt(strD1[1]);
		 System.out.println(twenty_99[i1]+" "+one_19[i2]);
	} else if(digits>99&&digits<1000&&strFor.equals("1")||strFor.equals("0")) {
		String strD1 [] = str1.split("");
		String str2 = str1.substring(1);
		String strD2 [] = str2.split(" ");
		
		i1=Integer.parseInt(strD1[0]);
		i2=Integer.parseInt(strD2[0]);
		System.out.println(hundreed_999[i1]+" "+one_19[i2]);
	} else if (digits>99&&digits<1000) {
		String strD1 [] = str1.split("");
	
		
		i1=Integer.parseInt(strD1[0]);
		i2=Integer.parseInt(strD1[1]);
		i3=Integer.parseInt(strD1[2]);
		System.out.println(hundreed_999[i1]+" "+twenty_99[i2]+" "+one_19[i3]);
	} else {
		System.out.println("Oops");
	}
}
}
