import java.util.ArrayList;

public class EjemploG {
    public static void main(String[] args) {
        //Genéricos (<T>) indican qué tipo de datos puede almacenar una estructura.
        ArrayList<String> list = new ArrayList<>();

        list.add("Hola");

        String text2 = (String)list.get(0);

        System.out.println(text2);

    }
}