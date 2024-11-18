//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DeviceFactory androidFactory = new AndroidDeviceFactory();
        Smartphone androidPhone = androidFactory.createSmartphone();
        Tablet androidTablet = androidFactory.createTablet();
        Laptop windowsLaptop = androidFactory.createLaptop();

        androidPhone.call();
        androidTablet.browse();
        windowsLaptop.code();

        System.out.println();

        DeviceFactory appleFactory = new AppleDeviceFactory();
        Smartphone applePhone = appleFactory.createSmartphone();
        Tablet appleTablet = appleFactory.createTablet();
        Laptop macBook = appleFactory.createLaptop();

        applePhone.call();
        appleTablet.watchVideo();
        macBook.code();
    }
}