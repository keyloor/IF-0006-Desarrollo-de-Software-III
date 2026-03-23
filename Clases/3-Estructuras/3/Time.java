
import java.util.ArrayList;
import java.util.LinkedList;

public class Time {
    public static void main(String[] args) {
        long listSize = 10000000;
        ArrayList<Integer> a = new ArrayList<>();
        LinkedList<Integer> l = new LinkedList<>();

        //ArrayList Time
        long startA = System.nanoTime();
        for (int i = 0; i < listSize; i++) {
            a.add(i);
        }
        long finishA = System.nanoTime();

        System.out.println("Array list insertion time:   " + (finishA - startA + " ns"));

        //Linked list Time
        long startL = System.nanoTime();
        for (int i = 0; i < listSize; i++) {
            l.add(i);
        }
        long finishL = System.nanoTime();

        System.out.println("Linked list insertion time:  " + (finishL - startL + " ns"));

        System.out.println("------------------------------------------");

        //ArrayList Get Time
        long startAG = System.nanoTime();
        a.get(1000);
        long finishAG = System.nanoTime();

        System.out.println("Array list get time:   " + (finishAG - startAG + " ns"));


        //Linked list Get Time
        long startLG = System.nanoTime();
        l.get(1000);
        long finishLG = System.nanoTime();

        System.out.println("Linked list get time:  " + (finishLG - startLG + " ns"));


    }    
}
