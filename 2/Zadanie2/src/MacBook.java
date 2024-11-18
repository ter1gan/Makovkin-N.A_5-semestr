public class MacBook implements Laptop {
    @Override
    public void code() {
        System.out.println("Программировать на MacBook");
    }

    @Override
    public void browse() {
        System.out.println("Просмотр веб-страниц на MacBook");
    }
}