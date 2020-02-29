package Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class PrintShortestWord2 {
public static void main(String[] args) {
	
	/*
	 	Write a program that will find out shortest 
	 	words in the given string str. If there are 
	 	few words that are evenly short, print them all. 
	 	Use split method in order to split str string 
	 	variable and create an array of strings.  
	 	Print array with Arrays.toString() method. 
	 	Sort array before printing. 
	 */
	
	
	Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();

    String [] newStr = str.split(", ");
    int min = 999999;
	String wordS ="";
	
    for (int i = 0;i < newStr.length;i++) {
    	 if(newStr[i].length()<=min) {
    		 min = newStr[i].length();
    		 wordS=newStr[i];
    	 }
    }
    for (int j = 0;j<newStr.length;j++) {
    	if(newStr[j].length()==min&&!wordS.contains(newStr[j])) {
    		wordS+=" " +newStr[j];
    	}
    }
    
     
     String [] MainW = wordS.split(" ");
     Arrays.sort(MainW);
     System.out.println(Arrays.toString(MainW));
  
}
}