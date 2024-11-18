//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Создание папок
        VideoFolder rootFolder = new VideoFolder("Корневая папка");
        VideoFolder actionMoviesFolder = new VideoFolder("Боевики");
        VideoFolder comedyMoviesFolder = new VideoFolder("Комедии");

        // Создание видеофайлов
        VideoFile video1 = new VideoFile("Action Movie 1.mp4");
        VideoFile video2 = new VideoFile("Action Movie 2.mp4");
        VideoFile video3 = new VideoFile("Comedy Movie 1.mp4");

        // Добавление видеофайлов в папки
        actionMoviesFolder.addComponent(video1);
        actionMoviesFolder.addComponent(video2);
        comedyMoviesFolder.addComponent(video3);

        // Добавление папок в корневую папку
        rootFolder.addComponent(actionMoviesFolder);
        rootFolder.addComponent(comedyMoviesFolder);

        // Отображение структуры
        rootFolder.display("");
    }
}