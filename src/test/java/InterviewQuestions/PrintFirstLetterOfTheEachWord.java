package InterviewQuestions;

public class PrintFirstLetterOfTheEachWord {

    public static void M(String s) {

        String[] arr = s.split(" ");

        for (String each : arr) {

            System.out.print(each.substring(0,1)+" ");
        }

    }

    public static void main(String[] args) {

        String s = "I hope we have a beatifull day tomorrow";
        M(s);
    }
}
