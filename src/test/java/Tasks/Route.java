package Tasks;

import java.util.Scanner;

public class Route {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    String start = scan.next();
    String end = scan.next();
    String str="";
    int j1=0,j2=end.charAt(0);
    char char1=start.charAt(0);
    while(char1!=j2)
    {
        if(char1%4==1)str+=("right > ");//A
        else if(char1%4==2)str+=("down > ");//B
        else if(char1%4==3)str+=("left > ");//C
        else if(char1%4==0)                                      //D
        {
            str+=("up > ");
            char1=64;
        }
        char1++;
    }
       if(!str.equals("")) str=str.substring(0,str.length()-3)+": "+end+" found";
       else str+=end+" found";
     System.out.println(str);
}}
