package CodeWars;

public class Initials {

    public static String abbrevName(String name) {
//String[] names = name.split(" ");
//return (names[0].charAt(0) + "." + names[1].charAt(0)).toUpperCase();
        String newname="";
        if(name.length()>0){
            for (int i =0;i<name.length();i++){
                if(i==0) {
                    newname += "" + Character.toUpperCase(name.charAt(i))+".";
                } else if (Character.isSpaceChar(name.charAt(i-1))){
                    newname+=""+Character.toUpperCase(name.charAt(i));
                    break;
                }
            }

        }
        return newname;
    }

    public static void main(String[] args) {
        System.out.println(abbrevName("zakhatricn bleat"));
    }


}
