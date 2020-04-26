package CodeWars;

import java.util.ArrayList;
import java.util.Arrays;

public class DigitalRoot {

    public static int digital_root(int n) {
/*
while(n > 9){
      n = n/10 + n % 10;
      }
    return(n);
     */
/*
return n < 10 ? n : digital_root(digital_root(n/10)+n%10);
 */

        ArrayList<String> list = new ArrayList<>(Arrays.asList(String.valueOf(n).split("")));
        int result = 0;
        while (list.size() != 1) {
            for (int i = 0; i < list.size(); i++) {
                result += Integer.parseInt(list.get(i));
            }
            if (result < 10) {
                return result;
            } else {
                list.clear();
                list.addAll(Arrays.asList(String.valueOf(result).split("")));
                result = 0;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(digital_root(942));
    }
}
