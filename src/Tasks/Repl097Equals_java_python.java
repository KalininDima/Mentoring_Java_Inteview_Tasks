package Tasks;

import java.util.Scanner;

public class Repl097Equals_java_python {
	public static void main(String[] args) {
		
/*
 Given a string, print out true if the number of 
 appearances of "java" anywhere in the string is equal to the 
 number of appearances of "python" anywhere in the string (case sensitive).
Example:
input: We study java not python
output: true

Example:
input: What's the difference between java, javascript and python?
output: false
 */
		
		Scanner scan = new Scanner(System.in);
		
	    String sentence = scan.nextLine();
	   
	    int i ;
	    int l =sentence.length()-1;
	    int J = 0;
	    int P = 0;
	  
	    if(l>9) {
	  for(i=0;i<=l-3;i++) {
	  
		  if((sentence.substring(i,i+4)).equals("java")) {
			  J++;
		  }
	  }
		  for(i=0;i<=l-5;i++) {
			  if((sentence.substring(i,i+6)).equals("python")){
		  P++;  
	  }
	  }
		  
	  if(J==P) {
		  System.out.println("true");
	  } else {System.out.println("false");
	  }
		  
	    
	    } else {System.out.println("false");
	    }
		
	
	    

}
}