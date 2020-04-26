package CodeWars;

import java.util.ArrayList;


public class VasiaClerk {

    public static String Tickets(int[] peopleInLine) {
        Integer tf = 25;
        Integer ff = 50;
        int count50;
        int count25;
        int lastBreak;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < peopleInLine.length; i++) {

            lastBreak=0;
            count25=0;
            count50=0;
            System.out.println(list);
            switch (peopleInLine[i]) {
                case 25:
                    list.add(25);
                    break;
                case 50:
                    for (int j = 0; j < list.size(); j++) {
                        if (!list.contains(25)) {
                            return "NO";
                        } else if (list.get(j) == 25) {
                            list.set(j, 50);
                        }
                    }
                    break;
                case 100:
                    for (int k = 0; k < list.size(); k++) {

                        if (list.get(k) == 25) {
                            ++count25;
                        } else if (list.get(k) == 50) {
                            ++count50;
                        }
                        if (count25 > 2) {
                            list.remove(tf);
                            list.remove(tf);
                            list.remove(tf);
                            list.add(100);
                            ++lastBreak;
                            break;
                        } else if (count50 > 0 && count25 > 0) {
                            list.remove(ff);
                            list.remove(tf);
                            list.add(100);
                            ++lastBreak;
                            break;
                        }
                    }
                    if (lastBreak == 0) {
                        return "NO";
                    }
                default:
                    return "NO";
            }

        }
        return "YES";
    }

    public static void main(String[] args) {
        int[] b = {25,33,25,25};
        System.out.println(Tickets(b));
    }
}
