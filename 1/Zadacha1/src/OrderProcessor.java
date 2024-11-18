import java.util.HashMap;
import java.util.Map;

public class OrderProcessor {
    private Map<String, ProductFactory> factories = new HashMap<>();

    public OrderProcessor() {
        factories.put("одежда", new ClothingFactory());
        factories.put("обувь", new ShoesFactory());
        factories.put("электроника", new ElectronicsFactory());
    }

    public void processOrder(String type, String name, double price, Order order) {
        ProductFactory factory = factories.get(type.toLowerCase());
        if (factory != null) {
            Product product = factory.createProduct(name, price);
            order.addProduct(product);
        } else {
            System.out.println("Unknown product type: " + type);
        }
    }
}

