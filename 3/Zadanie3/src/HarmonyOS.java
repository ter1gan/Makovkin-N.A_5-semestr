public class HarmonyOS implements MobileOperatingSystem {
    public void installApp(String appName) {
        System.out.println("Устанавливаю " + appName + " на HarmonyOS.");
    }

    public void updateApp(String appName) {
        System.out.println("Обновляю " + appName + " на HarmonyOS.");
    }
}

