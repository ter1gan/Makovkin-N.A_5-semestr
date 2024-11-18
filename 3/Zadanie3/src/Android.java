public class Android implements MobileOperatingSystem{
    public void installApp(String appName) {
        System.out.println("Устанавливаю " + appName + " на Android.");
    }

    public void updateApp(String appName) {
        System.out.println("Обновляю " + appName + " на Android.");
    }
}
