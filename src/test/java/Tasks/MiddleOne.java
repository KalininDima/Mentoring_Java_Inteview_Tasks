package Tasks;
import java.util.*;
public class MiddleOne {
	public static void main(String[] args) {
		
/*
You have a word, do the following:

1. When word has odd number of characters and:
            - 3 or more characters, print middle letter
      oak ==> a
      javav ==> v
             - Single character, print that character 3 times
      # ==> ###
      q ==> qqq

2. When word has even number of characters and:
           - 4 or more characters, print middle 2
     java ==> av
     apples ==> pl
     #$%^&* ==> %^
           - 2 characters, print those 2 characters twice
      @@ ==>@@@@
      $$ ==>$$$$
      hi ==> hihi


 */
		 Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		    //YOUR CODE HERE
		    int LW = word.length();
		    
		    if(LW%2!=0||LW==1||LW%2==0||LW==2){
		          if (LW==1) {
		          System.out.println(word+word+word);
		    } else if (LW==2) {
		    	System.out.println(word+word);
		    } else if( LW%2!=0) {
		    	LW = LW/2;
		    	word = ""+word.charAt(LW);
		    	System.out.println(word);
		    } else if (LW%2==0) {
		    	LW = LW/2;
		    	word = ""+word.charAt(LW-1)+word.charAt(LW);
		    	System.out.println(word);
		    	
		    }
		
		
		
		    }
		
}
}