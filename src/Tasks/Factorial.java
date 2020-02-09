package Tasks;

import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
	/*
	 In mathematics, the factorial of a 
	 positive integer n, denoted by n!, is the product 
	 of all positive integers less than or equal to n.  
	 Calculate factorial and output 
	 result to the console. 
	 */
	Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    long n2 = n;
	
	for (double i = n2-1;i>0;i--) {
		n2*=i;
	}
	System.out.println(n2);
	
	//20922789888000
}
}
