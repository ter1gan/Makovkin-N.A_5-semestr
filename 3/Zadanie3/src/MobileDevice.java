public abstract class MobileDevice {
    protected MobileOperatingSystem operatingSystem;

    protected MobileDevice(MobileOperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public abstract void install(String appName);
    public abstract void update(String appName);
}