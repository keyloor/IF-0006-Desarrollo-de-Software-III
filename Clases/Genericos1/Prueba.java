import java.util.ArrayList;

public class Prueba {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        list.add("Hola");

        //Antes de java 5 se casteaba porque no se sabe que objeto tiene dentro el arrayList
        String text = (String) list.get(0);
        System.out.println(text);

        //Java 5 ->
        //Genéricos (<T>) indican qué tipo de datos puede almacenar una estructura.
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Hola");
        String text2 = (String)list2.get(0);
        System.out.println(text2);
        

    }
}