
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Collection<Integer> lista1 = new ArrayList<>();
        lista1.add(123);

        Collection<Integer> lista2 = new ArrayList<>();
        lista2.add(321);
        lista2.add(98);
        
        System.out.println("addAll      > " + lista1.addAll(lista2));
        System.out.println("isEmpty     > " + lista1.isEmpty());
        System.out.println("size        > " + lista1.size());
        System.out.println("containsAll > " +lista1.containsAll(lista2));
        System.out.println("equals      > " + lista1.equals(lista2));
        System.out.println("remove      > " + lista2.remove(928));
        System.out.println("removeAll   > " + lista1.removeAll(lista2));

        List<Integer> lista3 = new ArrayList<>();
        lista3.addAll(lista2);
        System.out.println("Get         > " + lista3.get(0));
        System.out.println("Set         > " + lista3.set(0, 2));
        System.out.println("IndexOf     > " + lista3.indexOf(98));
        System.out.println("IndexOf     > " + lista3.indexOf(123));
        System.out.println("Remove      > " + lista3.remove(0));

        
        
    }
    
}
