public class Animation2 implements Animation {
    private int duration; // Время анимации в миллисекундах

    public Animation2(int duration) {
        this.duration = duration;
    }

    @Override
    public void animate() {
        System.out.println("Время второй анимации " + duration + " мс");
    }

    @Override
    public Animation clone() {
        try {
            return (Animation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Не удалось клонировать.", e);
        }
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}


