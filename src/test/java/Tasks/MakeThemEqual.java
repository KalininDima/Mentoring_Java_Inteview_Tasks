package Tasks;
/*
 Ask user to enter two words. 
 If they are equal length, print them together.
 If one is longer than the other one, 
 print equal number of characters from the long one.

Input:

book

pen

Output:

boopen


 */
import java.util.Scanner;

public class MakeThemEqual {
public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
System.out.println("Enter two words: ");

String word1 = in.nextLine(), 
	   word2 = in.nextLine();

int LengthW1 = word1.length(), 
	LengthW2 = word2.length(); 
int HowManyMinus =0 ;
if(LengthW1==LengthW2) {
	System.out.println(word1+word2);}
else if (LengthW1>LengthW2) {
	HowManyMinus=(LengthW1-LengthW2);
	word1 = word1.substring(HowManyMinus);
	System.out.println(word1+word2);
} else if (LengthW1<LengthW2) {
	HowManyMinus=(LengthW2-LengthW1);
	word2 = word2.substring(HowManyMinus);
	System.out.println(word1+word2);}
	















/*	else if(LengthW1>LengthW2){
		
			word1 = word1.replace(""+word1.charAt(word1.length()-1),"") ;
			word2 = word2.replace(""+word2.charAt(0),"");
			System.out.println(word1+word2);}
		else if (LengthW1%2!=0&&LengthW1>LengthW2||LengthW1<LengthW2) {
			word1 = word1.replace(""+word1.charAt(word1.length()-1),"") ;
			System.out.println(word1+word2);
			} 
		else if (LengthW2%2!=0&&LengthW2>LengthW1) {
			word2 = word2.replace(""+word2.charAt(0),"");
			System.out.println(word1+word2);}
		
}else {}*/


	
	

}
}
