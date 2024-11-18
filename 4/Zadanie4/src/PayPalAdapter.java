public class PayPalAdapter implements PaymentGateway {
    private PayPalService payPalService;

    public PayPalAdapter(PayPalService service) {
        this.payPalService = service;
    }

    @Override
    public void processPayment(double amount) {
        payPalService.makePayment(amount);
    }
}
