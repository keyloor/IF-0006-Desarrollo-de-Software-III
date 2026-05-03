
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Empleado> list = new ArrayList<>();

        list.add(new Empleado("Keylor1", 1000, 18));
        list.add(new Empleado("Keylor2", 1100, 18));
        list.add(new Empleado("Keylor3", 2100, 18));
        list.add(new Empleado("Keylor4", 3100, 18));
        list.add(new Empleado("Keylor5", 4100, 18));

        System.out.println("Salary test: ");
        salaryTest(list, 1000);

        System.out.println("Age test: ");
        ageTest(list, 17);

        salaryIncrease(list);
    }

    //Mostrar salarios mayores al dado
    public static void salaryTest(List<Empleado> list, double salario) {
        list.stream()
                .filter(empleado -> empleado.getSalario() > salario) // Filtra dependiendo de cierta condicion
                .forEach(empleado -> System.out.println(empleado.getNombre()));
    }

    //Mostrar empleados con edad menor al valor dado 
    public static void ageTest(List<Empleado> list, int age) {
        long cantidad = list.stream()
                .filter(empleado -> empleado.getEdad() < age)
                .count(); //Se encarga de contar

        System.out.println(cantidad);
    }

    //Aumentar salario y mostrar
    public static void salaryIncrease(List<Empleado> list) {
        list.stream()
                //Se encarga de agarrar
                .map((empleado) -> {
                    empleado.setSalario(empleado.getSalario() * 1.10);
                    return empleado; //Map necesita que le devolvamos algo
                })
                .forEach(empleado -> System.out.println("Salario actualizado: " + empleado.getSalario()
        ));
    }
}
