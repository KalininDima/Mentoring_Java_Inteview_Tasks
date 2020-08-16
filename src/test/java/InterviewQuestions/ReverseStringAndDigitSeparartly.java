package InterviewQuestions;

import java.util.Arrays;
import java.util.List;

public class ReverseStringAndDigitSeparartly {


    public static void ReverseSeparartly(String s){

        String newstr = "";

        for (int i = 0 ;i<s.length();i++){
            newstr +=""+s.charAt(i);
            if(Character.isDigit(s.charAt(i))&&i<s.length()-1){
                if(Character.isAlphabetic(s.charAt(i+1))){
                    newstr+=",";
                }
            } else if(Character.isAlphabetic(s.charAt(i))&&i<s.length()-1){
                if(Character.isDigit(s.charAt(i+1))){
                    newstr+=",";
                }
            }

        }
        System.out.println(newstr);

        String [] arr = newstr.split(",");
        System.out.println(Arrays.toString(arr));
        s="";
        for (String each: arr){
            char[] chr = each.toCharArray();
            Arrays.sort(chr);
            for(Character eachchar: chr){
                s+=eachchar;
            }
        }

        System.out.println(s);

    }

    public static void main(String[] args) {
        ReverseSeparartly("AAAFF1234351REEWQA559003");



    }


}
