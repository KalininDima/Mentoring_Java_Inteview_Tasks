package Tasks;

import java.util.Scanner;

public class SalesTaxes {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		System.out.println("Enter the amoint of purchase ");
		double amount = in.nextDouble();
		double taxes = amount * 0.06;
		
		System.out.println(taxes+" its your taxes from purchase "+amount);
		
		
	}
	
	
	
}
