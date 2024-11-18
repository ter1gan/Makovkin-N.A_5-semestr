public class Main {
    public static void main(String[] args) {
        MobileDevice androidPhone = new Smartphone(new Android());
        androidPhone.install("WhatsApp");
        androidPhone.update("WhatsApp");

        MobileDevice iosPhone = new Smartphone(new iOS());
        iosPhone.install("Telegram");
        iosPhone.update("Telegram");

        MobileDevice harmonyPhone = new Smartphone(new HarmonyOS());
        harmonyPhone.install("Twitter");
        harmonyPhone.update("Twitter");


    }
}
