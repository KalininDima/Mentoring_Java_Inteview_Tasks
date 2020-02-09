package Tasks;

import java.util.Scanner;

public class Rep_071Alejandro2 {
/*
 as Alejandro is time is precious and even with his little 
 knowledge of programming he managed to save some time. but still
  he had a lot of emails to read.
he wants to add more conditions to his program,
 he wants only job related mails so he will narrow it 
 down by also checking if the word 
 "project" also appears beside his name, that way 
 he will be sure its a job email that refers to him.
 
For example:
a = "dear alejandro.....alot of text"
outputs: "dont read"
a = "thunder blaz is the best drink in the galaxy..."
outputs: "dont read"
 */
	  public static void main(String[] args) {
		    Scanner s = new Scanner(System.in);
		    String a = s.nextLine();

		    //your code here
		    String A = "alejandro";
		    String P = "project";
		    
		    if (a.contains(A) && a.contains(P)){
		    System.out.println("read mail");
		    } else { System.out.println("dont read");}
		    
		     
		    }

}
