public class PaypalFactory implements Factory {

    @Override
    public Payment createProduct() {
        return new Paypal();
    }

}