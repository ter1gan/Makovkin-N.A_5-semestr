import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import javax.imageio.ImageIO;

public class ImageCacheManager {
    private HashMap<String, BufferedImage> imageCache;

    public ImageCacheManager() {
        imageCache = new HashMap<>();
    }

    // Метод для загрузки изображения из URL
    public BufferedImage loadImageFromURL(String imageUrl) throws IOException {
        // Проверяем, есть ли изображение в кэше
        if (imageCache.containsKey(imageUrl)) {
            System.out.println("Получение изображения из кэша: " + imageUrl);
            return imageCache.get(imageUrl);
        }

        // Если нет в кэше, загружаем его
        System.out.println("Загрузка изображения: " + imageUrl);
        BufferedImage image = ImageIO.read(new URL(imageUrl));
        imageCache.put(imageUrl, image); // Сохраняем изображение в кэше
        return image;
    }

    // Метод для загрузки изображения из локального файла
    public BufferedImage loadImageFromFile(String filePath) throws IOException {
        // Проверяем, есть ли изображение в кэше
        if (imageCache.containsKey(filePath)) {
            System.out.println("Получение изображения из кэша: " + filePath);
            return imageCache.get(filePath);
        }

        // Если нет в кэше, загружаем его
        System.out.println("Загрузка изображения из файла: " + filePath);
        BufferedImage image = ImageIO.read(new File(filePath));
        imageCache.put(filePath, image); // Сохраняем изображение в кэше
        return image;
    }

    // Метод для очистки кэша
    public void clearCache() {
        imageCache.clear();
        System.out.println("Кэш очищен.");
    }

    // Метод для удаления определенного изображения из кэша
    public void removeImageFromCache(String key) {
        if (imageCache.containsKey(key)) {
            imageCache.remove(key);
            System.out.println("Изображение удалено из кэша: " + key);
        } else {
            System.out.println("Изображение не найдено в кэше: " + key);
        }
    }
}

