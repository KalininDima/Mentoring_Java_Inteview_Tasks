package Tasks;

import java.util.Scanner;

public class ArraysAverageTemperature {
public static void main(String[] args) {
	/*Given an array temps of doubles,
	 *  containing temperature data, 
	 *  compute the average temperature. 

	Store the average in a variable called avgTemp. 

	Besides temps and avgTemp, 
	you may use only two other variables
	 -- an int variable k and a double 
	 variable named total, which have 
	 been declared.
	
	*/
	
	Scanner scan = new Scanner(System.in);
	int k = 0;
	double total = 0;
	double avgTemp = 0;
	double[] temps = { 
			scan.nextDouble(),
			scan.nextDouble(),
			scan.nextDouble(),
			scan.nextDouble(),
			scan.nextDouble(),
			scan.nextDouble(),
			scan.nextDouble(),
			scan.nextDouble()
	};
	
	for (int i = 0; i<=temps.length-1;i++) {
		total+=temps[i];
	} avgTemp+=total/8;
	
	System.out.println(avgTemp);

}
}