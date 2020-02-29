package InterviewQuestions;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveSpaces {

    public static void main(String[] args) {
        String e = "qwery    uyuyuy      p";
        e = e.replaceAll("( )+", " ");
        System.out.println(e);

    }
}
