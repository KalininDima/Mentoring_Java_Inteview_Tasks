package CodeWars;

import org.jsoup.helper.StringUtil;

public class DrinkHangover {

    public String hydrate(String drinkString) {

        /*
         Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher(drinkString);

        int waterGlasses = 0;

        while (matcher.find()){
            waterGlasses += Integer.valueOf(matcher.group());
        }
        return (waterGlasses > 1)? waterGlasses +" glasses of water" : waterGlasses +" glass of water";
         */


        String result = "";
        int count = 0;
        for (int i = 0; i < drinkString.length(); i++) {
            if (Character.isDigit(drinkString.charAt(i))) {
                count += Integer.parseInt("" + drinkString.charAt(i));
            }


        }


        result += count+" glasses of water";
        return result;
    }

    public static void main(String[] args) {
        DrinkHangover r = new DrinkHangover();
        System.out.println(r.hydrate("1 shot, 5 beers and 1 glass of wine"));
    }


}
