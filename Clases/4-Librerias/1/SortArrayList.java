
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrayList {
    public static void main(String[] args) {
        List<Task> task = new ArrayList<>();

        task.add(new Task("name4", 4));
        task.add(new Task("name1", 1));
        task.add(new Task("name2", 2));
        task.add(new Task("name3", 3));

        //Task class needs to implement Collection
        Collections.sort(task);
        
        
    }
}