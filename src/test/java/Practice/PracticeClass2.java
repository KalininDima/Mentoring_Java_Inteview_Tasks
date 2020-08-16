package Practice;


import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Collectors;


public class PracticeClass2 {
    /*
    1. Write a return
    method that check if a string is
    build out of the same letters as another string.
     */
    public static void T1(String a, String b) {

     /*
        a = new TreeSet<>(Arrays.asList(a.split(""))).toString();
        b = new TreeSet<>(Arrays.asList(b.split(""))).toString();

      */
        int count = 0;
        a = a.toLowerCase();
        b = b.toLowerCase();
        for (Character eachA : a.toCharArray()) {
            for (Character eachB : b.toCharArray()) {
                if (eachA.equals(eachB) && a.length() == b.length()) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count == a.length());
    }

    public static void T1_A1_(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        char[] c1 = a.toCharArray();
        char[] c2 = b.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        System.out.println(Arrays.equals(c1, c2));

    }


    /*
    2. Write a return method that can remove the duplicated values from String
     */
    public static void T2(String a) {
//
        a = new HashSet<>(Arrays.asList(a.split(""))).toString();
        System.out.println(a);
//
//        String q = "";
//        for (Character e : a.toCharArray()) {
//            for (Character r : a.toCharArray()) {
//                if (e.equals(r) && !q.contains(e.toString())) {
//                    q += e;
//                }
//
//            }
//
//        }
//
//        System.out.println(q);
//

    }


    /*
    3. Write a return method that can find
    the unique characters from the String
     */
    public static void T3(String a) {

        String r = "";
        int count = 0;

        for (Character each1 : a.toCharArray()) {
            for (Character each2 : a.toCharArray()) {
                if (each1.equals(each2)) {
                    count++;
                }
            }
            if (count == 1) {
                r += each1;
            }
            count = 0;
        }
        System.out.println(r);


    }

    /*
4. Write a return method that can reverse String
     */
    public static void T4(String d) {
        StringBuilder r = new StringBuilder(d).reverse();
        System.out.println(r);

        String e = "";
        for (int i = d.length() - 1; i >= 0; i--) {
            e += d.charAt(i);
        }
        System.out.println(e);


    }

    /*
    5. Write a return method that can find the frequency of characters
     */
    public static void T5(String h) {

        Map<Character, Integer> map = new TreeMap<>();

        for (Character each : h.toCharArray()) {
            if (!map.containsKey(each)) {
                map.put(each, 1);
            } else {
                map.put(each, map.get(each) + 1);
            }
        }
        System.out.println(map);

    }

    /*
    T6.Divide 2 digits with out division operator
     */
    public static void T6(int a, int b) {
        int c = 0;
        while (a >= b) {
            c++;
            a -= b;

        }
        System.out.println(c);
    }

    /*
check the password valid or not
requirements:
1. Password MUST be at least have 6 characters and should not contain space 2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise returns false
     */
    public static boolean T7(String s) {


        String chars = "(.*[a-z]*.)",
                digits = ".*[0-9]*.",
                symbols = ".*[-/, :-@]*.",
                CHARS = ".*[A-Z]*.";
        boolean check1 = s.matches(chars),
                check2 = s.matches(digits),
                check3 = s.matches(symbols),
                check4 = s.matches(CHARS);
        if (check1 && check2 && check3 && check4 && s.length() >= 6 && !s.contains(" ")) {
            return true;
        } else {
            return false;
        }
    }

    /*
    find max num from array
     */
    public static void T8(int[] arr) {
//        int max = Integer.MIN_VALUE;
//
//        for (int each : arr) {
//            if (each > max) {
//                max = each;
//            }
//        }
        SortedSet<Integer> ss = new TreeSet<Integer>(Arrays.stream(arr).boxed().collect(Collectors.toList()));

        System.out.println(ss.last());
    }

    /*
    9. Write a return method that
     can sort an int array in Ascending order
      without using the sort method of the Arrays class
     */
    public static void T9_Sort(int[] a) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int each : a)
            list.add(each);

        for (int i = 0; i < a.length; i++) {
            a[i] = T9_findMin(list);
            list.remove(Integer.valueOf(a[i]));
        }

    }

    public static int T9_findMin(ArrayList<Integer> list) {
        int min = Integer.MAX_VALUE;

        for (Integer i : list) {
            min = Math.min(min, i);
        }

        return min;
    }

    /*
    11. Write a function:
that, given an integer N (1 < N < 100),
returns an array containing N unique integers
that sum up to 0. The function can return any such array.
 For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
 The answer [1, -1,1,3] would be incorrect (because value 1 occurs twice).
  For N = 3 one of the possible answers is [-1,0,1] (but there are many more correct answers).
     */

    public static int[] T11(int n) {

        int fv = 0;
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                a[i] = -fv;
                break;
            }
            a[i] = ((int) (Math.random() * 20) - 10);
            fv += a[i];

        }
        return a;
    }


    /*
    13. Write a method which can identifies given number is even or odd
     */
    public static void T13(int i) {
        if (i % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    /*
    14. Write a method that can divide two numbers without using division operator
     */

    public static void T14(int a, int b) {
        if (a == 0 || b == 0) {
            System.out.println("faiiiil");
            return;
        }
        int ab = 0;
        while (a >= b) {
            a -= b;
            ++ab;
        }
        System.out.println(ab);
    }

    /*
    15. Write a method which prints out the numbers from 1 to 30 but
for numbers which are a multiple of 3, print "FIN" instead of the number
 and for numbers which are a multiple of 5, print "RA" instead of the number.
  for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
     */

    public static void T15(int e) {
        String result = "";
        for (int i = 1; i <= e; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result += "FINRA ";
            } else if (i % 3 == 0) {
                result += "FIN ";
            } else if (i % 5 == 0) {
                result += "RA ";
            } else {
                result += i + " ";
            }
        }

        System.out.println(result);
    }

    /*
    16. Swap two variable' values without using a third variable
     */
    public static void T16(int y, int r) {
        y = y + r;
        r = y - r;
        y = y - r;

        System.out.println(y + " " + r);

    }

    /*17. Write a function:
that, given a positive integer N, prints the consecutive numbers
 from 1 to N, each on a separate line. However, any number divisible by 2, 3 or 5 should be
 replaced by the word Codility, Test or Coders respectively. If a number is divisible by more
  than one of the numbers: 2,3 or 5, it should be replaced by a concatenation of the respective
   words Codility, Test and Coders in this given order. For example, numbers divisible by both 2 and 3
   should be replacée by CodilityTest and numbers divisible by all
three numbers: 2,3 and 5, should be replaced by CodilityTestCoders.

     */
    public static void T17() {

    }

    /*
    18. Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
Write a java operation to remove all the names named Ahmed
     */

    public static void T18(ArrayList<String> l) {

//        while(l.contains("Ahmed")){
//            l.remove("Ahmed");
//        }

        l.removeAll(Arrays.asList("Ahmed"));


        System.out.println(l);

    }

    /*
    19. Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc.
    remove all values greater than 100.
     */

    public static void T19(ArrayList<Integer> list) {

//    1.    ArrayList<Integer> list2 = new ArrayList<>();
//        for (Integer i : list) {
//            if (i > 100) {
//                list2.add(i);
//            }
//        }
//        list.removeAll(list2);
//        System.out.println(list);

        //2.
        Iterator<Integer> It = list.iterator();

        while (It.hasNext()) {
            if (It.next() > 100) {
                It.remove();
            }
        }

        //3. list.removeIf(integer -> integer > 100);
        System.out.println(list);

    }

    /*
    20. Given an array of 3 characters print all permutation
    combinations from the given characters
     */

    public static void T20() {

    }

    public static void main(String[] args) {
        T6(12, 3);
        String a = "Dimaa";
        String b = "idaam";

        T1(a, b);

        T1_A1_(a, b);
        T2("fjjjjjjjjgggkkkkrrrlrllll");
        T3("rrrrrreeeeeolkfffgghhhyCCCCV");
        T4("Stirng");
        T5("qefnowjadjnsanscandbjoegqknacadsij(");


        int[] aa = {1, 44, 44, 56, 2, 2};
        int tt = 2;
        Arrays.sort(aa);
        System.out.println(Arrays.binarySearch(aa, 44));

        int[] arr = {1, 2, 45, 5, 67, 8};
        int[] arr2 = {4, 3, 2, 67, 7, 7, 7, 78, 12, 333, 41};


        System.out.println(T7("asasdsaeweqAA4311&#d"));

        T8(arr);

        System.out.println(Arrays.toString(T11(31)));

        T13(40);

        T14(1, 0);

        T15(30);

        T16(51, 13);
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
        T18(names);
        ArrayList<Integer> l = new ArrayList<>(Arrays.asList(4, 3, 2, 67, 7, 7, 7, 78, 12, 333, 414, 412, 33, 3333, 44));
        T19(l);


        long t = System.nanoTime();
        String s = "String";
        int i = 12345;

        System.out.println("int  "+i+ " "+(System.nanoTime() - t));
        System.out.println("String "+s+" "+ (System.nanoTime() - t));

        String x = "techbeamers";
        String y = new String(new char[] { 't', 'e', 'c', 'h', 'b', 'e', 'a', 'm', 'e', 'r', 's' });
        System.out.println(x == y);
        System.out.println(x.equals(y));



        // S1 referys to Object in the Heap Area

        String s1 = new String("GFG"); // Line-1

        // S2 refers to Object in SCP Area
        String s2 = s1.intern(); // Line-2

        // Comparing memory locations
        // s1 is in Heap
        // s2 is in SCP
        System.out.println(s1 == s2);

        // Comparing only values
        System.out.println(s1.equals(s2));

        // S3 refers to Object in the SCP Area
        String s3 = "GFG"; // Line-3

        System.out.println(s2 == s3);

        StringBuilder sb = new StringBuilder ("top 30 Java String interview questions.");

        System.out.println(sb.length());

        System.out.println(Integer.parseInt("10"));

        String aString = "Fucking String";
       // String[] strArray = aString.split("\s+");

        String JavaStr = "Are you a Java expert? Yes, you are.";
        System.out.println(JavaStr.indexOf("?"));

        Scanner in = new Scanner(System.in);

        System.out.println(add(in.nextLine(), in.nextInt(), in.nextInt()));

    }

    public static int add(String operator, int a, int b){

        int result=0;
        if(operator.equals("add")){
            result = a+b;
        } else if( operator.equals("subtract")){
            result=a-b;
        }

        return result;
    }

    

}