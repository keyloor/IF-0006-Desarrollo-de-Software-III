public class Paypal implements Payment {
    @Override
    public void pay() {
        System.out.println("You payed with Paypal.");
    }

}