package CodeWars;

public class TotalPoints {

    public static int points(String[] games) {

        /*
        return Arrays.stream(games)
                     .mapToInt(score -> score.charAt(0) - score.charAt(2))
                     .map(match -> match > 0 ? 3 : match == 0 ? 1 : 0)
                     .sum();
         */


        int result = 0;
        for (String each : games) {
            if (each.charAt(0) > each.charAt(2)) {
                result += 3;
            } else if (each.charAt(0) < each.charAt(2)) {

            } else {
                result++;
            }
        }
        return result;
    }

}
