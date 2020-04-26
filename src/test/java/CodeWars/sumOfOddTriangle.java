package CodeWars;

import java.util.ArrayList;
import java.util.Iterator;

public class sumOfOddTriangle {
    public static int rowSumOddNumbers(int n) {
/*
             1
          3     5
       7     9    11
   13    15    17    19
21    23    25    27    29
 */
//        int result = 1;
//        ArrayList<Integer> list = new ArrayList<>();
//        if (n > 1) {
//            for (int i = 0; i <= n; i++) {
//                System.out.println(i);
//                result += 2;
//                list.add(result);
//            }
//        } else {
//            return 1;
//        }
//        System.out.println(list);
//
//        result=0;
//        Iterator<Integer> it = list.listIterator();
//        while(it.hasNext()){
//            System.out.println(result);
//            result+=it.next();
//
//        }

        return n*n*n;
    }

    public static void main(String[] args) {
        System.out.println(rowSumOddNumbers(4));
    }

}
