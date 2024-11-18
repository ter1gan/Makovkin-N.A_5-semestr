public class ShoesFactory implements ProductFactory{
    @Override
    public Product createProduct(String name, double price) {
        return new Shoes(name, price);
    }

}
