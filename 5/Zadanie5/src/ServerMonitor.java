import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class ServerMonitor {
    private List<Server> servers;
    private NotificationService notificationService;

    public ServerMonitor(List<Server> servers, NotificationService notificationService) {
        this.servers = servers;
        this.notificationService = notificationService;
    }

    public void startMonitoring() {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                for (Server server : servers) {
                    double simulatedLoad = Math.random() * 100; // Симуляция нагрузки
                    server.updateStatus(simulatedLoad);

                    if (!server.isRunning()) {
                        notificationService.notifyFailure(server);
                    } else if (server.getLoad() > 80.0) {
                        notificationService.notifyHighLoad(server);
                    }
                }
            }
        }, 0, 5000); // Проверка каждые 5 секунд
    }
}
