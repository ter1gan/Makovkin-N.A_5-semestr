public abstract class SmartDevice {

    // Шаблонный метод
    public final void controlDevice() {
        connectToDevice();
        executeOperation();
        disconnectFromDevice();
    }

    protected abstract void executeOperation(); // Абстрактный метод для выполнения операции

    private void connectToDevice() {
        System.out.println("Подключение к устройству " + this.getClass().getSimpleName());
    }

    private void disconnectFromDevice() {
        System.out.println("Отключение от устройства " + this.getClass().getSimpleName());
    }
}
