//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SmartDevice light = new SmartLight();
        light.controlDevice();

        System.out.println();

        SmartDevice ac = new SmartAC();
        ac.controlDevice();

        System.out.println();

        SmartDevice lock = new SmartLock();
        lock.controlDevice();
    }
}