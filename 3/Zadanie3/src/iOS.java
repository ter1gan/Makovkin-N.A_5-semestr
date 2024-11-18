public class iOS implements MobileOperatingSystem {
    public void installApp(String appName) {
        System.out.println("Устанавливаю " + appName + " на iOS.");
    }

    public void updateApp(String appName) {
        System.out.println("Обновляю " + appName + " на iOS.");
    }
}