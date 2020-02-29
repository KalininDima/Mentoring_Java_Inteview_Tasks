package Tasks;
import java.util.Scanner;
public class TaskTime {

public static void main(String[] args) {
  Scanner input = new Scanner (System.in);
  System.out.println("Enter Hours ");
  byte H,M,S;
  byte MaxH = 12;
  byte MaxM = 60;
  byte MaxS = 60;
  String AmPm;
  H = input.nextByte();
  	 if (H<=MaxH) {
  		System.out.println("Enter Minutes ");
  		
  	 }
       else {
    	   System.out.println("Start again and enter hours not higher than 12");
    	   
       }
  M = input.nextByte();
  		if (M<=MaxM) {
     System.out.println("Enter Seconds ");
     
  		}
  		else {
  			System.out.println("Start again and enter minutes not higher than 60");
  			
  		}
  		
  S = input.nextByte();
  	if (S<=MaxS) {
  		System.out.println("Enter AM or PM "); 
  		AmPm = input.nextLine();
}
  	 else {
  		System.out.println("Start again and enter seconds not higher than 60");
  	 }
  	
  	if (input.hasNextLine()) {
  		AmPm = input.nextLine();
  	System.out.println("Your time "+H+":"+M+":"+S+ " "+AmPm);
  	
  	}
  	
		  
		  
		  
	  
  }
  
 
	
	
}	

