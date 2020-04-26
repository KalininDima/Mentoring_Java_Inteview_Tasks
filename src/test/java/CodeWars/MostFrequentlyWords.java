package CodeWars;

import java.util.*;

public class MostFrequentlyWords {

    public static List<String> top3(String s) {

        //int min = Integer.MIN_VALUE;
        int count = 0;
        List<Object> list = new ArrayList<>(Arrays.asList(s.split(" ")));
        Map<String, Integer> map = new TreeMap<>();
        for (Object each : list) {
            for (Object each1 : list) {
                if(map.containsKey(each.toString())){
                    break;
                } else if (each.equals(each1)) {
                    count++;
                }
            }
            if (!map.containsKey(each.toString())) {
                map.put(each.toString(), count);
            }
            count = 0;
        }
        list.clear();
        ArrayList<Integer> result = new ArrayList<>();
        result.add(0);
        System.out.println(result);
        int index =0;
        for(String eachM : map.keySet()){
            for(Object each :list ){
                result.set(index,Math.max(map.get(eachM), (Integer) each));
            }
            index++;
        }
        System.out.println(result);
        return null;
    }

    public static void main(String[] args) {
        System.out.println(top3("In a village of La Mancha, the name of which I have no desire to call to\n" +
                "mind, there lived not long since one of those gentlemen that keep a lance\n" +
                "in the lance-rack, an old buckler, a lean hack, and a greyhound for\n" +
                "coursing. An olla of rather more beef than mutton, a salad on most\n" +
                "nights, scraps on Saturdays, lentils on Fridays, and a pigeon or so extra\n" +
                "on Sundays, made away with three-quarters of his income."));
    }

}
