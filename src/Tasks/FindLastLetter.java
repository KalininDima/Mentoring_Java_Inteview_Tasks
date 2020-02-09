package Tasks;

import java.util.Scanner;

public class FindLastLetter {

  public static void main(String[] args) {
    //DO NOT CHANGE
    Scanner scan = new Scanner(System.in);
    String word = scan.next();
    //WRITE YOUR CODE HERE
    String last = " "+word.charAt(word.length()-1);
    System.out.println(last);
}
}
