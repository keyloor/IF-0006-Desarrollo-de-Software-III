
public class Main {

    public static void main(String[] args) {
        PaypalFactory paypalFactory = new PaypalFactory();
        CreditCardFactory creditCardFactory = new CreditCardFactory();

        Payment paypal = paypalFactory.createProduct();
        paypal.pay();

        Payment creditCard = creditCardFactory.createProduct();
        creditCard.pay();
    }
}
