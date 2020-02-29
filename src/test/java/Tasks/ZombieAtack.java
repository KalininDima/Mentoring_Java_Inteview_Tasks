package Tasks;

import java.util.Scanner;

public class ZombieAtack {
public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
    int inhabitants = scan.nextInt();
    int day = 0;
    for (int i = inhabitants;i>0;i/=2) {
    	
     System.out.println("Day "+day+" "+"["+inhabitants+"]");
     day++;
     inhabitants /=2 ;
     }
System.out.println("---- EXTINCT ----");
	
	
	
	
	
}
}
