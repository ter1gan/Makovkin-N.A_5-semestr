public class AppleDeviceFactory implements DeviceFactory {
    @Override
    public Smartphone createSmartphone() {
        return new IPhone();
    }

    @Override
    public Tablet createTablet() {
        return new IPad();
    }

    @Override
    public Laptop createLaptop() {
        return new MacBook();
    }
}
