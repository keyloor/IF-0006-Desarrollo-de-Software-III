
import java.util.LinkedList;
import java.util.List;



public class SortLinked {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>(List.of(1, 2, 3, 4));

        java.util.Collections.sort(linkedList);
        java.util.Collections.reverse(linkedList);

        System.out.println(linkedList);
    }
}