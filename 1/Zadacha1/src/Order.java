import java.util.ArrayList;
import java.util.List;


public class Order {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void printOrder() {
        for (Product product : products) {
            System.out.println("Товар: " + product.getName() + ", Цена: " + product.getPrice());
        }
    }
}
