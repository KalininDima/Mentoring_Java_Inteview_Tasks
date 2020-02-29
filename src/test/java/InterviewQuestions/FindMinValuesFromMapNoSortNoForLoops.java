package InterviewQuestions;


import java.util.*;

public class FindMinValuesFromMapNoSortNoForLoops {

    public static void Method1(Map<String, Integer> map) {
        //1
        SortedSet<Integer> ss = new TreeSet<>(map.values());
         System.out.println(ss.first());

       // System.out.println(ss.subSet(0, 2));

        //2
        //System.out.println(Collections.max(map.values()));


    }

    public static void main(String[] args) {

        /*

         */
        Map<String, Integer> karta = new HashMap<>();
        karta.put("a", 100);
        karta.put("b", 22);
        karta.put("c", 78);
        karta.put("F", 30);
        Method1(karta);

        TreeSet<Integer> ss = new TreeSet<>(karta.values());
        System.out.println(ss);
        System.out.println(ss.headSet(30));
        System.out.println(ss.tailSet(78));
        System.out.println(ss.subSet(30,100));
        System.out.println("=====================");


    }
}
