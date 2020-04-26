package CodeWars;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Minimum {

    public static int minValue(int[] values) {

        /*
        String s = Arrays.stream(values)
                .sorted()
                .distinct()
                .mapToObj(Integer::toString)
                .collect(Collectors.joining(""));
        return Integer.valueOf(s);
         */
        SortedSet<Integer> ss = IntStream.of(values).boxed().collect(Collectors.toCollection(TreeSet::new));
        Iterator<Integer> it = ss.iterator();
        String str = "";
        while (it.hasNext()) {
            str += String.valueOf(it.next());
        }
        return Integer.parseInt(str);
    }

    public static void main(String[] args) {
        int u[] = {1, 9, 3, 1, 7, 4, 6, 6, 7};
        System.out.println(minValue(u));
    }

}
