package InterviewQuestions;

import java.util.Arrays;

public class ReverseArrayValues {
    public static void main(String[] args) {


        //=====
        String[] arr = {"Ruslan", "Inna"};
      for (int i =0;i<arr.length;i++){
            arr[i]=new StringBuilder(arr[i]).reverse().toString();
        }
        System.out.println(Arrays.toString(arr));
        //=====






        String nr = "";
        String r = "";
        for (int i = 0; i < arr.length; i++) {
            nr = arr[i];
            for (int j = nr.length() - 1; j >= 0; j--) {
                r += nr.charAt(j);
            }
            arr[i] = r;
            r = "";
        }

        System.out.println(Arrays.toString(arr));
    }

}
