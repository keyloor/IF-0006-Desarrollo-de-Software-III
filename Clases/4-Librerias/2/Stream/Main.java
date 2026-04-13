
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6);

        List<Integer> result = nums.stream()
            //Only even
            .filter(n -> n % 2 == 0)
            //Times 10
            .map(n -> n * 10)
            //Save
            .toList();
   
            
        for(Integer i : result) {
            System.out.println(i);
        }

    }
}