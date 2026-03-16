import java.util.List;

public class Desconocido {
    public static void imprimirLista(List<?> lista) {
        for (Object object : lista) {
            System.out.println(object);
        }
    }
}
