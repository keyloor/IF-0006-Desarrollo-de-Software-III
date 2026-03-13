public class Main {

    public static void main(String[] args) {

        Drivable car = new Car();
        Flyable airplane = new Airplane();
        Sailable boat = new Boat();

        car.drive();
        airplane.fly();
        boat.sail();
    }
}
