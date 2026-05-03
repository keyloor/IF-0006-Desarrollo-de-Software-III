
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Course> list = new ArrayList<>();

        list.add(new Course(1, "Matematica", 30));
        list.add(new Course(2, "Fisica", 45));
        list.add(new Course(3, "Quimica", 20));
        list.add(new Course(4, "Historia", 60));
        list.add(new Course(5, "Ingles", 35));

        //Utilizamos el metodo de collections .sort pasandole la lista y el comparator que creamos para sortear la lista
        Collections.sort(list, new StudentCountComparator());

        for (Course course : list) {
            System.out.println(course);
        }

        //Version con lambda directamente en el main
        Collections.sort(list, (o1, o2) -> o2.getStudentCount() - o1.getStudentCount());

    }
}
