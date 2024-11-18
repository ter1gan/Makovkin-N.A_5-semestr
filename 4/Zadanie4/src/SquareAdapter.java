public class SquareAdapter implements PaymentGateway {
    private SquareService squareService;

    public SquareAdapter(SquareService service) {
        this.squareService = service;
    }

    @Override
    public void processPayment(double amount) {
        squareService.makePayment(amount);
    }
}
