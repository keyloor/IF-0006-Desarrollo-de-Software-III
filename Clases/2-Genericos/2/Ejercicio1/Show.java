public class Show {
    public static void main(String[] args) {
        show("asdasd");
        show(2.2);
        show(1);
    }

    public static <T> void show(T value) {
        System.out.println(value);
    }
}
