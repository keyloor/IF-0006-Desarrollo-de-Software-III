
import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Collection <String> vehiculos = new ArrayList<>();
        
        vehiculos.add("Bicicleta");
        vehiculos.add("Carro");
        vehiculos.add("Avión");
        
        vehiculos.forEach(vehiculo -> System.out.println(vehiculo));
    }
}