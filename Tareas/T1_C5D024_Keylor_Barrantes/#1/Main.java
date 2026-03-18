public class Main {
    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.save("Hola");
        System.out.println(box.get());

        Box<Integer> boxInteger = new Box<>();
        boxInteger.save(1);
        System.out.println(box.get());
    }
}
