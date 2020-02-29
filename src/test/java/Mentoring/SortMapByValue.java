package Mentoring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class SortMapByValue {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<Integer, String>();

        map.put(1, "c");
        map.put(4, "a");
        map.put(5, "f");
        map.put(2, "e");
        map.put(3, "b");
        map.put(11, "a");
        map.put(6, "g");
        map.put(7, "z");
        map.put(8, "d");
        map.put(100, "aa");

        ArrayList<String> listN = new ArrayList<>(map.values());
        Collections.sort(listN);
        System.out.println("Sorted list\n" + listN);

        Map<Integer, String> Linked = new LinkedHashMap<Integer, String>();
        for (String each : listN) {
            for (Integer each1 : map.keySet()) {
                if (each == map.get(each1)) {
                    Linked.put(each1, each);
                }
            }
        }

        System.out.println("Non sorted values of map\n" + map);
        System.out.println("Sorted values of map\n" + Linked);

    }

}
