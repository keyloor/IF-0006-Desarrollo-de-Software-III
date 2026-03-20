public class CompareElements {
    public static void main(String[] args) {
        System.out.println(compare(12, 1));
        System.out.println(compare("hola", "hola"));
        
    }

    public static <T> boolean compare(T element1, T element2) {
        System.out.println("Comparing " + element1 + " with " + element2 + ":");
        return element1.equals(element2);

    }
}
