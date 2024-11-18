import java.io.Serializable;

public class Task implements Serializable {
    private String name;
    private String status;

    public Task(String name) {
        this.name = name;
        this.status = "Новая";
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Задача: " + name + ", Статус: " + status;
    }
}
