
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Collection <String> vehiculos = new ArrayList<>();
        List<String> list = new ArrayList<>();
        list.add("DSNJALDNJ");
        
        vehiculos.add("Bicicleta");
        vehiculos.add("Carro");
        vehiculos.add("Avión");

        System.out.println(list.getFirst());
        
        vehiculos.forEach(vehiculo -> System.out.println(vehiculo));
    }
}