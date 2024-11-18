public class IPad implements Tablet {
    @Override
    public void browse() {
        System.out.println("Просмотр веб-страниц на iPad");
    }

    @Override
    public void watchVideo() {
        System.out.println("Просмотр видео на iPad");
    }
}