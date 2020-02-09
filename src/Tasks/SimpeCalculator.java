package Tasks;

import java.util.Scanner;

public class SimpeCalculator {
public static void main(String[] args) {
	
	
	
	/*
	 create a static method called "plus", 
	 its return is void and it gets no arguments.

It asks the user to input two numbers, 
then it will add them and print the result.
Create a scanner within plus method.
	 */
	
	
	plus();
	
}
public static void plus(){
    
    //your code here
	Scanner in = new Scanner (System.in);
	int a = in.nextInt();
	int b = in.nextInt();
	 
	System.out.println("result: "+a+b);
	
  }

}
