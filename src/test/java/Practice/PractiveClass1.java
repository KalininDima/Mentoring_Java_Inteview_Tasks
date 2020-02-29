package Practice;

import org.apache.poi.xwpf.usermodel.XWPFDocument;

import java.io.*;
import java.lang.reflect.Array;
import java.nio.Buffer;
import java.util.*;

public class PractiveClass1 {

    public static void main(String[] args) throws FileNotFoundException {

        int a =10;
        int b = 20;
        a=a+b;
        b=a-b;
        a-=b;



        System.out.println(a+"/"+b);
        String t = "gersgbgsrxccbgdx";
        char[] e = t.toCharArray();
        int c = 0;
        for (char each : e) {
            c++;
        }
        System.out.println(c);

        //=============
        int i = -82687657, temp = 0;

        while (i != 0) {

            temp = (temp * 10) + (i % 10);
            i /= 10;
        }

        System.out.println(temp);

        //=======

        XWPFDocument D = new XWPFDocument();
        FileOutputStream Create = new FileOutputStream("DocFile.doc");
        Create.getChannel();
        D.createParagraph();
        FileReader file = new FileReader("file.txt");
        BufferedReader bufferedReader = new BufferedReader(file);
        D.createParagraph().getDocument();

        //======

        int r[] = new int[4];
        int fg[] = {1, 34, 3, 33, 32};
        int rwe[][] = new int[][]{{3, 4, 31, 3, 5, 12, 5}, {2, 2, 33, 4}};
        //======

        Map<String, Integer> m = new LinkedHashMap<>();
        m.put("Vasia", 4);
        m.put("qwer", 15);
        m.put("sd", 11);
        m.put("asf", 111);
        m.put("gk", 2);
        m.put("asdf", 131);
        List<Integer> set = new ArrayList<>();


        for (String each : m.keySet()) {
            set.add(m.get(each));
        }
        Collections.sort(set);
        Map<String, Integer> newmap = new LinkedHashMap<>();

        for (Integer each : set) {
            for (String each1 : m.keySet()) {
                if (m.get(each1).equals(each)) {
                    newmap.put(each1, each);
                }
            }

        }
        System.out.println(m);
        System.out.println(newmap);
        System.out.println(set);
    }


}

