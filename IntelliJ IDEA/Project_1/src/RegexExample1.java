import java.util.regex.Pattern;

public class RegexExample1 {
    public static void main(String[] args) {
        String content = "I am ironman" + "from here";

        String pattern = ".*here*";

        boolean isMatch = Pattern.matches(pattern,content);
        System.out.println("is this line incloud 'here'?" + isMatch);
    }
}
