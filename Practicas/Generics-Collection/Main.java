
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // 5
        List<Integer> nums3 = List.of(4, 5, 10);

        Integer result3 = 1;

        for (int i = 0; i < nums3.size(); i++) {
            result3 *= nums3.get(i);
        }

        System.out.println(result3);

        // 6
        List<Integer> nums2 = List.of(4, 5, 1);

        Integer result2 = 0;

        for (int i = 0; i < nums2.size(); i++) {
            result2 += nums2.get(i) - i;
        }

        System.out.println(result2);

        // 7
        List<Integer> nums = List.of(4, 3, 1);

        Integer result = 0;

        for (int i = 0; i < nums.size(); i++) {
            result += nums.get(i) * i;
        }

        System.out.println(result);

        // 8
        List<String> strings = List.of("4s", "3", "1");
        System.out.println(isParseable(strings));

    }

    public static boolean isParseable(List<String> list) {
        try {
            for (String s : list) {
                System.out.println(s);
                //Integer.parseInt(s);
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
