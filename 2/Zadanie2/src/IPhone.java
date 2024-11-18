public class IPhone implements Smartphone {
    @Override
    public void call() {
        System.out.println("Звонок с iPhone");
    }

    @Override
    public void sms() {
        System.out.println("Отправка SMS с iPhone");
    }
}