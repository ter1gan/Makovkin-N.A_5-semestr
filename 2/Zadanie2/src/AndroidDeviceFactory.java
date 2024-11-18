public class AndroidDeviceFactory implements DeviceFactory {
    @Override
    public Smartphone createSmartphone() {
        return new AndroidSmartphone();
    }

    @Override
    public Tablet createTablet() {
        return new AndroidTablet();
    }

    @Override
    public Laptop createLaptop() {
        return new WindowsLaptop(); // Или Android ноутбук
    }
}