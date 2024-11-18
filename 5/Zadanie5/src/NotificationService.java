public class NotificationService {
    public void notifyFailure(Server server) {
        System.out.println("Сервер " + server.getName() + " не реагирует.");

    }

    public void notifyHighLoad(Server server) {
        System.out.println("Сервер " + server.getName() + " имеет высокую нагрузку: " + server.getLoad() + "%.");

    }
}
