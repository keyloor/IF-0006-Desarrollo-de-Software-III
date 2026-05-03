
public class Course {

    private String name;
    private int code;
    private int studentCount;

    public Course(int code, String name, int studentCount) {
        this.code = code;
        this.name = name;
        this.studentCount = studentCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Course{");
        sb.append("name=").append(name);
        sb.append(", code=").append(code);
        sb.append(", studentCount=").append(studentCount);
        sb.append('}');
        return sb.toString();
    }

}
