public class Main {
    public static void main(String[] args) {
        PaypalFactory paypalFactory = new PaypalFactory();
        CreditCardFactory creditCardFactory = new CreditCardFactory();

        Paypal paypal = (Paypal) paypalFactory.createProduct();
        paypal.pay();

        CreditCard creditCard = (CreditCard) creditCardFactory.createProduct();
        creditCard.pay();
    }
}  