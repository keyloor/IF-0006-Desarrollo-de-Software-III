
import java.util.Comparator;

public class StudentCountComparator implements Comparator<Course> {

    @Override
    public int compare(Course o1, Course o2) {
        return o2.getStudentCount() - o1.getStudentCount();
    }

}
