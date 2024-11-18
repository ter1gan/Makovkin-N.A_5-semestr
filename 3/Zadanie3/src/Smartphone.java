public class Smartphone extends MobileDevice {
    public Smartphone(MobileOperatingSystem operatingSystem) {
        super(operatingSystem);
    }

    @Override
    public void install(String appName) {
        operatingSystem.installApp(appName);
    }

    @Override
    public void update(String appName) {
        operatingSystem.updateApp(appName);
    }
}
