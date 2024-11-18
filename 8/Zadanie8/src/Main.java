import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Project project = Project.loadProject();

        while (true) {
            System.out.println("\nМеню:");
            System.out.println("1. Добавить задачу");
            System.out.println("2. Обновить статус задачи");
            System.out.println("3. Просмотреть задачи");
            System.out.println("4. Сохранить проект");
            System.out.println("5. Выход");

            System.out.print("Выберите опцию: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Введите имя задачи: ");
                    String taskName = scanner.nextLine();
                    project.addTask(taskName);
                    break;
                case 2:
                    System.out.print("Введите имя задачи для обновления статуса: ");
                    String name = scanner.nextLine();
                    System.out.print("Введите новый статус задачи: ");
                    String status = scanner.nextLine();
                    project.updateTaskStatus(name, status);
                    break;
                case 3:
                    project.printTasks();
                    break;
                case 4:
                    project.saveProject();
                    break;
                case 5:
                    System.out.println("Выход из приложения.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Неверный выбор, попробуйте снова.");
            }
        }
    }
}