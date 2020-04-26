package CodeWars;

import org.apache.commons.lang3.StringUtils;

public class CountCharInString {

    public static int strCount(String str, char letter) {

        return StringUtils.countMatches(str,letter);

     //   return Collections.frequency(Arrays.asList(str.split("")), ""+letter);

    }


}
