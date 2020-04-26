package CodeWars;

public class BreakCamelCase {

    public static String camelCase(String input) {
        /*
          return input.chars()
        .mapToObj(c -> c >= 'A' && c <= 'Z'
            ? new String(" " + (char) c)
            : new String("" + (char) c))
        .collect(Collectors.joining());
         */
        String r = "";
        for(Character each : input.toCharArray()){
            if(Character.isUpperCase(each)){
                r+=" "+each.toString();
            } else{
                r+=each.toString();
            }
        }
        return r;
    }

}
