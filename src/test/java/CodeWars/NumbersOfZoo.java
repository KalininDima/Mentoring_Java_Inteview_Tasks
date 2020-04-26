package CodeWars;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumbersOfZoo {

    public static int findMissingNumber(int[] numbers) {


//        long total = (numbers.length + 1) * (numbers.length + 2) / 2;
//        for (int i = 0; i < numbers.length; i++)
//            total-=numbers[i];
//        return (int) total;

//        int[] arr = new int[numbers.length];
//        System.arraycopy(numbers, 0, arr, 0, arr.length);
//        Arrays.sort(arr);
//        if (arr.length==0||arr[0] != 1)
//            return 1;
//        for (int i = 0; i < numbers.length; i++) {
//            if (i < numbers.length-1&& arr[i] + 1 != arr[i + 1]) {
//                return arr[i] + 1;
//            }
//        }
//        return arr[arr.length - 1] + 1;

//        int[] arr = new int[numbers.length];
//        System.arraycopy(numbers, 0, arr, 0, arr.length);
//        TreeSet<Integer> ss = Arrays.stream(arr).boxed().collect(Collectors.toCollection(TreeSet::new));
//        if (arr.length == 0 || ss.first() != 1)
//            return 1;
//        Iterator<Integer> it = ss.iterator();
//        Iterator<Integer> it1 = ss.iterator();
//        it1.next();
//        while (it.hasNext() && it1.hasNext()) {
//            if (it.next() + 1 != it1.next())
//                return it.next() - 1;
//        }
//        return ss.last()+1;

         return IntStream.rangeClosed(1,numbers.length+1).sum() - Arrays.stream(numbers).sum();


    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,14,12,15,17,18,19,20};
        System.out.println(findMissingNumber(arr));
        System.out.println(IntStream.range(1, arr.length + 2).sum());
        System.out.println(IntStream.rangeClosed(1,arr.length+1).sum());
    }

}
