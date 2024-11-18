//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        OrderProcessor orderProcessor = new OrderProcessor();

        orderProcessor.processOrder("одежда", "Футболка", 20.0, order);
        orderProcessor.processOrder("обувь", "Кроссовки", 50.0, order);
        orderProcessor.processOrder("Электроника", "Смартфон", 300.0, order);

        order.printOrder();
    }
}