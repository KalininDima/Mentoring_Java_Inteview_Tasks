package Tasks;

import java.util.Scanner;

public class Citizens {
	 public static void main(String[] args) {
		    //WRITE YOUR CODE HERE 
		    Scanner sc = new Scanner(System.in);
		    System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
		    int seniorCitizens = sc.nextInt();
		    int nonSeniorCitizens = sc.nextInt();
		    
		    System.out.println("What is new citizen's age?");
		    int age = sc.nextInt();
		    
		    if(age>=65){
		      System.out.println("Senior Citizen");
		      ++seniorCitizens;
		    } else if (age<=65){System.out.println("Non-Senior Citizen");
		                ++nonSeniorCitizens;
		    }
		    
		    System.out.println("New seniorCitizens count "+seniorCitizens+"\n"+
		                        "New nonSeniorCitizens count "+nonSeniorCitizens);
		    
		  }
		}

