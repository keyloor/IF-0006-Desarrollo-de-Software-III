public class CreditCardFactory implements Factory {

    @Override
    public Payment createProduct() {
        return new CreditCard();
    }

}