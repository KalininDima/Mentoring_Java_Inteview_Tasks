package Tasks;

import java.util.Scanner;

public class ArraysSplitEmail {
public static void main(String[] args) {
	
	
	/*
	 Given a String variable email,
	  write code using split method to print 
	  email id and domain in separate lines.
	 */
	
	 Scanner input = new Scanner(System.in);
	    String email = input.nextLine();
	    
	    	if(email.contains("@")) {
	    	email=email.replaceFirst("@", " ");
	    	
	    	if(!email.contains("@")) {
	    		 String [] newE = email.split(" ");
	    		    
	    		    	System.out.print("Email id: "+newE[0]+"\n");
	    		    	
	    		    	System.out.println("Email domain: "+newE[1]);
	    		    	
	    		    
	    	} else {
	    		System.out.println("Invalid email");
	    	}
	    	
	    	} else {
	    		System.out.println("Invalid email");
	    	}
	     
	     
	    	
	   
	    
	
}
}
