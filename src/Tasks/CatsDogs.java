package Tasks;

import java.util.Scanner;

public class CatsDogs {
public static void main(String[] args) {
	/*Print true if the string "cat" and "dog" 
	 * appear the same number of times 
	 * in the given string word. 
	 */

	Scanner scan = new Scanner(System.in);
    int countOfCats = 0;
    int countOfDogs = 0;
    String word = scan.next();
    
 

  if(word.contains("dog")&&word.contains("cat")){
    while(word.contains("dog")){
    	countOfDogs++;
		word=word.replaceFirst("dog", "");}
    while(word.contains("cat")) {
    	countOfCats++;
    	word=word.replaceFirst("cat", "");}
    		
    	 if(countOfDogs==countOfCats) {
    		 System.out.println("input: "+word+"\n"+"output: "+true);
    	    } else {System.out.println("input: "+word+"\n"+"output: "+false);}
    	    
    	} else {System.out.println("false");}
  

}
}