import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Project implements Serializable {
    private List<Task> tasks;
    private static final String FILENAME = "project.dat";

    public Project() {
        tasks = new ArrayList<>();
    }

    public void addTask(String name) {
        tasks.add(new Task(name));
    }

    public void updateTaskStatus(String name, String status) {
        for (Task task : tasks) {
            if (task.getName().equals(name)) {
                task.setStatus(status);
                return;
            }
        }
        System.out.println("Задача с именем '" + name + "' не найдена.");
    }

    public void printTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Нет задач в проекте.");
            return;
        }
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    public void saveProject() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILENAME))) {
            oos.writeObject(this);
            System.out.println("Проект успешно сохранен.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Project loadProject() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILENAME))) {
            return (Project) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return new Project(); // вернем новый проект в случае ошибки
        }
    }
}