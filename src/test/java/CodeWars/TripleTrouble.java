package CodeWars;

public class TripleTrouble {

    public static String tripleTrouble(String one, String two, String three){

        String str="";
        for(int i = 0;i<one.length();i++){
         str=str.concat(""+one.charAt(i)+two.charAt(i)+three.charAt(i));

        }


    return str;
    }

    public static void main(String[] args) {
        System.out.println(tripleTrouble("Bm", "aa", "tn"));
    }

}
