
import java.util.HashSet;
import java.util.Set;

public class App {

    public static void main(String[] args) throws Exception {
        String[] strArr = {"Prathamesh", "Shivram", "Shinde", "Prathamesh"};
        for (String s : strArr) {
            System.out.println(s);
        }

        Set<String> arrSet = new HashSet<>();
        for (String s : strArr) {
            arrSet.add(s);
        }

        System.out.println("************");
        for (String s : arrSet) {
            System.out.println(s);
        }
    }
}
