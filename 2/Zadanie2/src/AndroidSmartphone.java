public class AndroidSmartphone implements Smartphone {
    @Override
    public void call() {
        System.out.println("Вызов со смартфона на Android");
    }

    @Override
    public void sms() {
        System.out.println("Отправка SMS со смартфона на Android");
    }
}

