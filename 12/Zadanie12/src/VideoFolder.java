import java.util.ArrayList;
import java.util.List;

public class VideoFolder implements VideoComponent {
    private String name;
    private List<VideoComponent> components = new ArrayList<>();

    public VideoFolder(String name) {
        this.name = name;
    }

    public void addComponent(VideoComponent component) {
        components.add(component);
    }

    public void removeComponent(VideoComponent component) {
        components.remove(component);
    }

    @Override
    public void display(String indentation) {
        System.out.println(indentation + "Видеофайл: " + name);
        for (VideoComponent component : components) {
            component.display(indentation + "   ");
        }
    }
}
