package Tasks;

import java.util.Scanner;

public class Repl073_email2 {
public static void main(String[] args) {
	/*
	 * Write a program that will print out information 
	 * about user based on email. Print first and last name 
	 * from the upper case.

Example:
Input: craig_federighi@apple.com
Output: 
First name: Craig
Last name: Federighi
Domain: apple
Top-Level Domain: com
	 */
	
Scanner scan = new Scanner(System.in);
String email = "dmiriy_kalinin@vseyfe.com";
    
String fName = (""+email.charAt(0)).toUpperCase()+email.substring(1,email.indexOf("_"));
String lName = (""+email.charAt(email.indexOf("_")+1)).toUpperCase()+email.substring(email.indexOf("_")+2,email.indexOf("@"));
String domain = email.substring(email.indexOf("@")+1,email.indexOf("."));
String ToplvlDomain = email.substring(email.indexOf(".")+1);
	//System.out.println(fName+"/n"+lName);
System.out.println("First name: " + fName+"\n"+"Last name: "+lName
			+"\n"+"Domain: "+domain+"\n"+"Top-Level Domain: "+ToplvlDomain);
	
	
	
	
	
	
	
	
	
	
	
}
}
