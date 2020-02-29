package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class reverseNumber {
    public long reverse(long num) {
        long temp = 0;
        while (num != 0) {
            temp = (temp * 10) + (num % 10);
            num = num / 10;
        }
        return temp;
    }

    public long revrseString(long n) {

        StringBuilder s = new StringBuilder("" + n);
        long l = 0;
        if (n < 0) {
            s.delete(0, 1);
            s.reverse();
            l = -(Long.parseLong(s.toString()));
            return l;
        }
        s.reverse();
        l= Long.parseLong(s.toString());
        return l;

    }




    public static void main(String args[]) {
        List<Integer> l = new ArrayList<>(Arrays.asList(1,2,34,45,2,412,5,31));

        long n = -654312;
        reverseNumber inp = new reverseNumber();
        System.out.println("Given number is " + n);
        System.out.println("Reverse of given number is " + inp.reverse(n));
        System.out.println("Reverse of string " + inp.revrseString(n));
    }
}