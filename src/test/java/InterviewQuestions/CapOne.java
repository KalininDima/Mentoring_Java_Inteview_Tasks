package InterviewQuestions;

import java.lang.reflect.Array;
import java.util.*;

public class CapOne {
    public static int findSmallestDivisor(String s, String t) {
        // Write your code here
        if(!checkDivisor(s, t)) return -1;
        return getMinDiv(t);
    }
    // checks the common substring
    private static boolean checkDivisor(String s, String t){
        if(s.length()%t.length() != 0) return false;
        int len = t.length();
        for(int i=0; i<s.length(); i++){
            if(t.charAt(i%len) != s.charAt(i)){
                return false;
            }
        }
        return true;
    }
    private static int getMinDiv(String t){
        int minVal = t.length();
        int len = t.length();
//        for(int i=len/2; i>=1; i=i/2){
//            for(int j1=0, j2=i; j1<i; j1++, j2++){
//                if(t.charAt(j1)!=t.charAt(j2)){
//                    return minVal;
//                }
//            }
//            minVal = i;
//        }


        return minVal;
    }


    public static int FuckingOne(String s, String t){
        int ls=s.length();
        int lt = t.length()*2;

        if(lt>ls) return -1;

        for(int i=0; i<t.length(); i++){
            if(t.charAt(i) != s.charAt(i)){
                return -1;
            }
        }

        String [] ss = t.split("");
        SortedSet<String> ts= new TreeSet<String>(Arrays.asList(ss));
        return ts.size();
    }


    public static void main(String[] args) {
        System.out.println(FuckingOne("aaabcabcabcabcabc", "aaabc"));
    }
}



