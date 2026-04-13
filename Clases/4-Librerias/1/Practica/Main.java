
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<Product> list = new ArrayList<>();

        Product p1 = new Product("Computer", 800, 3);
        Product p2 = new Product("Laptop", 600, 6);
        Product p3 = new Product("Mouse", 50, 12);

        list.add(p1);
        list.add(p2);
        list.add(p3);

        Collections.sort(list, (person1, person2) -> p1.getPrice().compareTo(p2.getPrice()));
        printList(list);
        System.out.println("");
        Collections.sort(list);
        printList(list);
        System.out.println("");
        Collections.sort(list, new ComparadorPorNombre());
        printList(list);
        System.out.println("");
        Collections.sort(list, new ComparadorPorPrecio());
        printList(list);
        System.out.println("");


    }
    
    public static void printList(ArrayList<Product> list) {
        for(Product p: list) {
            System.out.println(p.toString());
        }
    }
}




