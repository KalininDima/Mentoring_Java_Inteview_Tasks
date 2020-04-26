package CodeWars;

import java.util.Arrays;

public class SplitStrings {


    public static String[] solution(String s) {
//String[] arr = s.split("(?<=\\G.{2})");
        if (s.length() % 2 != 0) {
            StringBuilder r = new StringBuilder(s);
            r.append("_");
            s = r.toString();
        }
        int index = 0;
        String[] arr = new String[s.length() / 2];
        for (int i = 0; i < s.length(); i += 2) {
            arr[index] = "" + s.charAt(i) + s.charAt(i + 1);
            index++;
        }

        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("abcde")));
    }


}
