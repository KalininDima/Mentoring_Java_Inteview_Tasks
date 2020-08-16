package InterviewQuestions;

import java.util.Arrays;

public class ArrayRemoveDigitAndChar {


    public static void M(String[] arr) {


        String[] StringArr = new String[arr.length];
        int[] IntArr = new int[arr.length];
        int IndexForDigit = 0;
        int IndexForCharacter = 0;
        String chars = "";
        String numbers = "";
        for (String s : arr) {
            for (Character c : s.toCharArray()) {
                if (Character.isDigit(c)) {
                    numbers += "" + c;
                } else {
                    chars += c;
                }
            }

            StringArr[IndexForCharacter] = chars;
            IntArr[IndexForDigit] = Integer.parseInt(numbers);

            IndexForCharacter++;
            IndexForDigit++;

            chars = "";
            numbers = "";

        }

        System.out.println(Arrays.toString(StringArr) + "\n" + Arrays.toString(IntArr));


    }

    public static void main(String[] args) {
        String[] a = {"Dima123", "Ruslan32", "34rr4", "Nut4ty4"};

        M(a);
    }
}
