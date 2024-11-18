//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PayPalService payPalService = new PayPalService();
        PaymentGateway payPalAdapter = new PayPalAdapter(payPalService);

        PaymentProcessor paymentProcessor = new PaymentProcessor(payPalAdapter);
        paymentProcessor.process(100.00);  // Оплата через PayPal на сумму: $100.0

        StripeService stripeService = new StripeService();
        PaymentGateway stripeAdapter = new StripeAdapter(stripeService);
        paymentProcessor = new PaymentProcessor(stripeAdapter);
        paymentProcessor.process(200.00);  // Оплата через Stripe на сумму: $200.0

        SquareService squareService = new SquareService();
        PaymentGateway squareAdapter = new SquareAdapter(squareService);
        paymentProcessor = new PaymentProcessor(squareAdapter);
        paymentProcessor.process(300.00);  // Оплата через Square на сумму: $300.0
    }
}