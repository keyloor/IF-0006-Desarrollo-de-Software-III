
import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Collection <String> vehiculos = new ArrayList<String>();
        
        vehiculos.add("pene");
        vehiculos.add("ano");
        vehiculos.add("vagina");
        
        vehiculos.forEach(vehiculo -> System.out.println(vehiculo));
    }
}