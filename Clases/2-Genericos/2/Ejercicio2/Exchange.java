public class Exchange {
    public static void main(String[] args) {
        exchange(1, 2);
        exchange(2.4, 3.2);
        exchange("Hola1", "Hola2");
    }

    public static <T> void exchange(T value1, T value2) {
        System.out.println("Before: 1> " + value1 + " 2> " + value2);

        T temp = value1;
        value1 = value2;
        value2 = temp;

        System.out.println("After: 1> " + value1 + " 2> " + value2);

    }
}
