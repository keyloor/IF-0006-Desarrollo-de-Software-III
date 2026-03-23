
import java.util.LinkedList;

public class Linked {
    public static void main(String[] args) {
        //Todo está conectado entre sí

        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(123);
        linkedList.add(124);
        linkedList.add(125);
        
        linkedList.addFirst(1);
        linkedList.addLast(4);

        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());

        linkedList.removeFirst();
        linkedList.removeLast();
        
    }    
}

