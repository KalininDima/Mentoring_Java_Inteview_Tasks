package CodeWars;

public class StringUtilse {

    public static String toAlternativeString(String string) {
       String s ="";

       for (Character each : string.toCharArray()){
           if(Character.isUpperCase(each)){
               s+=each.toString().toLowerCase();
           } else if (Character.isLowerCase(each)){
               s+=each.toString().toUpperCase();
           } else {
               s+=each.toString();
           }
       }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(toAlternativeString("AbRiCo12S[ ]rebOK "));
    }
}

