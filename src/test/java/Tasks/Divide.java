package Tasks;

import java.util.Scanner;

/*
 write a program that can divide two numbers 
DO NOT use division, multiplication, or module operators.
 */
public class Divide {
public static void main(String[] args) {
	
	
  Scanner sc = new Scanner (System.in);
 System.out.println("Enter two numbers");
 int one = sc.nextInt();
 int two = sc.nextInt();
 int count = 0;
 if (one >= two) {
 while (one>=two) {
	 one-=two;
	 count++;
 }
 System.out.println(count);
	
 } else if (one<two) {
	 while(one<=two) {
		 two-=one;
		 count++;
	 }
	 System.out.println(count);
	
 }

	

 
}
}
