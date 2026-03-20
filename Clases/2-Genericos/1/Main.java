import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Prueba de Generic
        GenericClass<String> generic = new GenericClass<>();
        generic.setValor("1");

        //Prueba de limites
        ArrayList<? super Number> list = new ArrayList<>();
        
        Integer integer = 10;
        Number number = 11; 

        list.add(integer);
        list.add(number);

        System.out.println(list);

    }


}
