import java.util.ArrayList;
import java.util.List;

public class IterationFromList {
    public static void main (String[] args) {

        List<String> companies = new ArrayList<>();
        companies.add("DELL");
        companies.add("APPLE");
        companies.add("SAMSUNG");
        companies.add("SONY");
        companies.add("ALCATEL");

        String result = "";
        for (int n=0; n < companies.size(); n++) {
            result = result+", "+companies.get(n);
            // System.out.println("Element " + n + " of the library is: " + companies.get(n));
        }
        String result2 = result.substring(2, result.length());
//System.out.println(result);
        System.out.println(result2);
    }
}
