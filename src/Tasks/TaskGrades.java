package Tasks;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // Enter your code here
    Scanner scan = new Scanner(System.in);
    System.out.println("Welcome to the Grader!");
    
    System.out.println("Please enter subject name number 1 and score for this subject");
    String subject1 = scan.nextLine();
    double grade1 = scan.nextDouble();
     
    System.out.println("Please enter subject name number 2 and score for this subject");
    scan.nextLine();
    String subject2 = scan.nextLine();
    double grade2 = scan.nextDouble();
    
    System.out.println("Please enter subject name number 3 and score for this subject");
    scan.nextLine();
    String subject3 = scan.nextLine();
    double grade3 = scan.nextDouble();
    
    System.out.println("Please enter subject name number 4 and score for this subject");
    scan.nextLine();
    String subject4 = scan.nextLine();
    double grade4 = scan.nextDouble();
    
    System.out.println("Please enter subject name number 5 and score for this subject");
    scan.nextLine();
    String subject5 = scan.nextLine();
    double grade5 = scan.nextDouble();
    
    double average = (grade1+grade2+grade3+grade4+grade5) / 5;
    String summary = "Summary: "+subject1+" - "+grade1
    +", "+subject2+" - "+grade2
    +", "+subject3+" - "+grade3
    +", "+subject4+" - "+grade4
    +", "+subject5+" - "+grade5+"\n";
    
    System.out.println(summary+"Your average score is: "+average);
    System.out.println("Thank you for using Grader!"+"\n"+
    "Goodbye!");
    
  }
}