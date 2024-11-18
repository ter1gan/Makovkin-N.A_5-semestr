public class StripeAdapter implements PaymentGateway {
    private StripeService stripeService;

    public StripeAdapter(StripeService service) {
        this.stripeService = service;
    }

    @Override
    public void processPayment(double amount) {
        stripeService.makePayment(amount);
    }
}

