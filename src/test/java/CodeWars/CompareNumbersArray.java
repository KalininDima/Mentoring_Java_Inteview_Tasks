package CodeWars;

public class CompareNumbersArray {



    public static String whatIs(Integer x) {
        for (Object[] p : specialNumbers) {
            if (p[0] == x)
                return (String)p[1];
        }
        return "nothing";
    }
    static final Object[][] specialNumbers = {
            {42, "everything"},
            {42 * 42, "everything squared"},
    };

    public static void main(String[] args) {

    }

}
