public class Animation1 implements Animation {
    private int duration;

    public Animation1(int duration) {
        this.duration = duration;
    }

    @Override
    public void animate() {
        System.out.println("Время первой анимации " + duration + " мс");
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