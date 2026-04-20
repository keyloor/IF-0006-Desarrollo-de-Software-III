
import java.util.HashMap;
import java.util.Map;

public class HashMapProgram {

    private Map<String, Integer> map;

    public HashMapProgram() {
        map = new HashMap<>();
    }

    public void insertKey(String key, Integer value) {
        map.put(key, value);
    }

    public Integer searchSum(String prefix) {
        Integer total = 0;

        for (Map.Entry<String, Integer> map2 : map.entrySet()) {
            if (map2.getKey().contains(prefix)) {
                total += map2.getValue();
            }
        }

        System.out.println("Total: " + total);
        return total;
    }

}
