import java.awt.image.BufferedImage;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ImageCacheManager cacheManager = new ImageCacheManager();

        try {
            // Загрузка изображения из URL
            BufferedImage image1 = cacheManager.loadImageFromURL("https://yandex.ru/images/search?from=tabbar&img_url=https%3A%2F%2Fwww.tapeciarnia.pl%2Ftapety%2Fnormalne%2F253304_gory_jezioro_swierki_swiatlo_cien_odbicie.jpg&lr=193&pos=0&rpt=simage&text=фото");
            // Загрузка того же изображения еще раз (должно взять из кэша)
            BufferedImage image2 = cacheManager.loadImageFromURL("https://yandex.ru/images/search?from=tabbar&img_url=https%3A%2F%2Fwww.tapeciarnia.pl%2Ftapety%2Fnormalne%2F253304_gory_jezioro_swierki_swiatlo_cien_odbicie.jpg&lr=193&pos=0&rpt=simage&text=фото");

            // Загрузка изображения из файла
            BufferedImage image3 = cacheManager.loadImageFromFile("C:\\Users\\user\\Desktop\\photo_2024-09-19_16-43-27.jpg");

            // Очистка кэша
            //cacheManager.clearCache();
        } catch (IOException e) {
            System.err.println("Ошибка при загрузке изображения: " + e.getMessage());
        }
    }
}
