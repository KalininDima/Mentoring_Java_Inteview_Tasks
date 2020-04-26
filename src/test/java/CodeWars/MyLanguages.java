package CodeWars;

import java.util.*;


public class MyLanguages {

    public static List<String> myLanguages(final Map<String, Integer> results) {

        List<String> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>(results.values());
        int y=0;
        while(list1.iterator().hasNext()){

            y+=list1.iterator().next();
        }
        Collections.sort(list1);
        Collections.reverse(list1);
        for (Integer each : list1){
                for(String each1 : results.keySet() ){
                    if(results.get(each1).equals(each)&&each>59){
                        list.add(each1);
                    }
                }
        }
        return list;
    }

    public static void main(String[] args) {
        Map<String,Integer> m = new HashMap<>();
        m.put("C#",41);
        m.put("Java",111);
        m.put("Ruby",94);
        m.put("JS",31);
        m.put("C++",12);
        m.put("I",444);
        System.out.println(myLanguages(m));
    }
}
