package CodeWars;

public class DuplicateEncoder {

    static String encode(String word) {

        /*
           word = word.toLowerCase();
    String result = "";
    for (int i = 0; i < word.length(); ++i) {
      char c = word.charAt(i);
      result += word.lastIndexOf(c) == word.indexOf(c) ? "(" : ")";
    }
    return result;
         */


        String result = "";

        for (Character each : word.toCharArray()){
            int count = 0;
            for (Character each1 : word.toCharArray()){
                if(each.toString().equalsIgnoreCase(each1.toString())){
                    count++;
                }
            }
            if(count==1){
                result+="(";
            } else {
                result+=")";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(encode("AAaaru"));
    }
}