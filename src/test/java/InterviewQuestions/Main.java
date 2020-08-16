package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Number number = 8;
        Number number2 = 8;

        System.out.println(number.intValue() + number2.intValue());
        System.out.println(number);
        System.out.println(number2);
        String[] Arr = new String[]{"Dima", "Tural", "Sergey", "Ruslan", "Dima", "Tural", "Sergey", "Ruslan"};
        Integer[] arr = {5, 4, 3, 321, 4, 5, 623, 2, 3, 4, 4, 5, 66, 6};
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(arr.clone()));


    }
}