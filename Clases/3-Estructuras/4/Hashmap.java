
import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
            //<ONLY JAVA CLASSES>
        HashMap<String, Integer> empIds = new HashMap<>();

        empIds.put("key1", 1123);
        empIds.put("key2", 2123);
        empIds.put("key3", 3123);

        System.out.println(empIds.get("key3"));
        System.out.println(empIds.containsKey("key2"));
        System.out.println(empIds.containsValue(123));
        
        //Override or creates if absent
        empIds.put("key3", 123);
        
        //Directly replace an existant value
        empIds.replace("key4", 123);

        //Only if its absent
        empIds.putIfAbsent("key3", 123);
    
    }
}