package Tasks;

import java.util.Scanner;
/*
 Write a Java program that can check the URL

Valid extensions for URL are: com, net, edu, org, gov

- check that it starts with www.
- check if it contains the ending dot right before the extension
- assign String domain and 
String extension.
- print them
"Domain:" amazon
"Extension:" com 


 */
public class WebAdress {
public static void main(String[] args) {
	
	Scanner scan = new Scanner (System.in);
	System.out.println("Enter a web Address");
	 String domain = scan.nextLine().toLowerCase();
	 boolean extention = domain.endsWith(".com")
			 ||domain.endsWith(".net")
			 ||domain.endsWith(".gov")
			 ||domain.endsWith(".org");
	 int Length = domain.length()-4;
	 if(domain.startsWith("www.") && extention) {
		
		 System.out.println("Domain: "+domain.substring(4,Length)+"\n"+"Extention: "+domain.substring(Length));

	 } else {
		 System.out.println("its invalid web address");
	 }

	
	
	
}
}
