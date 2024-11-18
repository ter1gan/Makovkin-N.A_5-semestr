public class ClothingFactory implements ProductFactory {
    public Product createProduct(String name, double price) {
        return new Clothing(name, price);
    }
}

// Реализация фабрики для обуви
