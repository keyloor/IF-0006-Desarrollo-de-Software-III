import java.util.ArrayList;

public static void main(String[] args) {
    ArrayList list = new ArrayList<>();
    list.add("Hola");
    list.add(10);
    
    String text = list.get(0);
    System.out.println(text);
}