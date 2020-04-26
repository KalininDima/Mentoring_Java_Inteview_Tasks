package CodeWars;

public class DidYouMean {


    private final String[] words;

    public DidYouMean(String[] words) {
        this.words = words;
    }

    public String findMostSimilar(String to) {
        
        return null;
    }

    public static void main(String[] args) {
        DidYouMean o = new DidYouMean
                (new String[]{"javascript", "java", "ruby", "php", "python", "coffeescript"});

        System.out.println(o.findMostSimilar("heaven"));
    }

}
