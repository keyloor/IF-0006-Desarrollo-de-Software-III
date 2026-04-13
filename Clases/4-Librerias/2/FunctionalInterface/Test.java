public class Test {
    public static void main(String[] args) {
        FunctionalInterfaceExample updateAction = () -> System.out.println("prueba");
        updateAction.update();

        //Ejemplo de uso como la clase anterior
        //Collections.sort(list, (person1, person2) -> p1.getPrice().compareTo(p2.getPrice()));
    }   
}