

public class Server {
    private String name;
    private boolean isRunning;
    private double load;

    public Server(String name) {
        this.name = name;
        this.isRunning = true; // Предполагаем, что сервер запущен
        this.load = 0.0; // Начальная нагрузка
    }

    public String getName() {
        return name;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public double getLoad() {
        return load;
    }

    public void updateStatus(double load) {
        this.load = load;
        this.isRunning = load < 95.0; // Предположим, что нагрузка выше 95% - это сбой
    }
}

