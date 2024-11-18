import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Server> servers = new ArrayList<>();
        servers.add(new Server("Server1"));
        servers.add(new Server("Server2"));
        servers.add(new Server("Server3"));

        NotificationService notificationService = new NotificationService();
        ServerMonitor serverMonitor = new ServerMonitor(servers, notificationService);
        serverMonitor.startMonitoring();
    }
}
