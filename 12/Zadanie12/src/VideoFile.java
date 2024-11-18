public class VideoFile implements VideoComponent {
    private String name;

    public VideoFile(String name) {
        this.name = name;
    }

    @Override
    public void display(String indentation) {
        System.out.println(indentation + "Видеофайл: " + name);
    }
}
