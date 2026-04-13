public class CreditCard implements Payment {
    @Override
    public void pay() {
        System.out.println("You payed with a credit card.");
    }

}