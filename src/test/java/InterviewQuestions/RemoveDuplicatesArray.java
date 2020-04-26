package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class RemoveDuplicatesArray {

    public static void SSA(String [] arr){

        SortedSet<String> r = new TreeSet<String>(Arrays.asList(arr.clone()));
        System.out.println(r);

    }

    public static void main(String[] args) {
        String []Arr = new String []{"Dima","Tural","Sergey","Ruslan","Dima","Tural","Sergey","Ruslan"};
        SSA(Arr);
    }
}
