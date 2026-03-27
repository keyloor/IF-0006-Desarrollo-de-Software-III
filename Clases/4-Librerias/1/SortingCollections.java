
import java.util.ArrayList;
import java.util.List;

public class SortingCollections {
    public static void main(String[] args) {
        List<String> listString = new ArrayList<>(List.of("Angelica", "Issac", "Rafa", "Ana"));
        java.util.Collections.sort(listString);
        System.out.println(listString);
        
    }
}