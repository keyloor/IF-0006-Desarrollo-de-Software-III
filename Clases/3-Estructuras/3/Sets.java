import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {

        //Hashset, no respeta el orden a la hora de imprimir y no permite duplicados
        
        Set<String> set1 = new HashSet<>();
        set1.add("1 Adam");
        set1.add("2 Mary");
        set1.add("3 Katy");
        set1.add("4 Adam");

        for (String string : set1) {
            System.out.println(string);
        }

        System.out.println("------------------------");

        //LinkedHash, lo mismo pero si permite orden de inserción
        Set<String> set2 = new LinkedHashSet<>();
        set2.add("1 Adam");
        set2.add("2 Mary");
        set2.add("3 Katy");

        for (String string : set2) {
            System.out.println(string);
        }

        System.out.println("------------------------");

        //TreeSet, se usa para almacenar elementos unicos, mantiene orden alfabetico
        Set<String> set3 = new TreeSet<>();
        set3.add("Adam");
        set3.add("Mary");
        set3.add("Baty");

        for (String string : set3) {
            System.out.println(string);
        }

        System.out.println("------------------------");

        //Para comportamientos de cola se usa el queue con linked list
        Queue<Integer> cola = new LinkedList<>();
        cola.offer(10);
        cola.offer(20);

        System.out.println(cola.poll());
        System.out.println(cola.peek());

        System.out.println("------------------------");

        //Priority queue, permite prioridad a ciertos elementos
        PriorityQueue<String> cola2 = new PriorityQueue<>();

        cola2.offer("Carlos1");
        cola2.offer("Carlos2");
        cola2.offer("Carlos3");
    }
}