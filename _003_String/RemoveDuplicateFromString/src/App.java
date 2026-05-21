
import java.util.LinkedHashSet;
import java.util.Set;

public class App {

    public static void main(String[] args) throws Exception {
        String str = "abcdefghijkcd";

        char[] caharArr = str.toCharArray();
        Set<Character> charSet = new LinkedHashSet<>();

        for (Character c : caharArr) {
            charSet.add(c);
        }
        StringBuilder sb = new StringBuilder();
        for (Character c : caharArr) {
            sb.append(c);
        }
        System.out.println(sb);
    }
}
