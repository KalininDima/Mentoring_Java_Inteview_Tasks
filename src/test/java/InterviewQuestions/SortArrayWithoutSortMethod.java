package InterviewQuestions;

import java.util.*;

public class SortArrayWithoutSortMethod {



    public static void SortingArray(List<Integer> l) {

        for (int i = 0; i < l.size(); i++) {
            for (int j = 0; j < l.size(); j++) {
                if (l.get(i) <l.get(j)) {
                    Integer temp = l.get(i);
                    l.set(i, l.get(j));
                    l.set(j, temp);
                }
            }
        }
        System.out.println(l);

    }


    public static void sorting(int[] l){

        for (int i = 0; i < l.length; i++) {
            for (int j = 0; j < l.length; j++) {
                if (l[i] > l[j]) {
                    int temp = l[j];
                    l[j] = l[i];
                    l[i] = temp;

                }
            }
        }
        System.out.println(Arrays.toString(l));

    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(12, 2, 5, null,8, 3,null,4, 1, 9));
//        SortingArray(list);

        ArrayList<String> l = new ArrayList<>(Arrays.asList("Dima","Tural","Sergey","Ruslan"));

        int[] arr = {12, 2, 5, 8, 3, 4, 1, 9};
        sorting(arr);
    }
}