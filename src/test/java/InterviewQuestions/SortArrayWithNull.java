package InterviewQuestions;


import java.util.*;

public class SortArrayWithNull {


    public static void SortNullArray(List<Integer> list){

        list.sort(Comparator.nullsFirst(Integer::compareTo));


//        int c=0;
//        for (int i =0;i<list.size();i++){
//            if(list.get(i)==null){
//                c++;
//                list.remove(null);
//            }
//        }
//
//        Collections.sort(list);
//        for (int j =0;j<c;j++){
//            list.add(null);
//        }

        System.out.println(list);



    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(12, 2, 5, null,8, 3,null,4, 1, 9));
        SortNullArray(list);
    }

}
