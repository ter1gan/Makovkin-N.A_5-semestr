public class AnimationManager {
    private Animation fadeInPrototype;
    private Animation slideInPrototype;

    public AnimationManager() {
        fadeInPrototype = new Animation1(1000); // 1 секунда
        slideInPrototype = new Animation2(800); // 0.8 секунды
    }

    public Animation createFadeInAnimation(int duration) {
        Animation1 clonedAnimation = (Animation1) fadeInPrototype.clone();
        clonedAnimation.setDuration(duration);
        return clonedAnimation;
    }

    public Animation createSlideInAnimation(int duration) {
        Animation2 clonedAnimation = (Animation2) slideInPrototype.clone();
        clonedAnimation.setDuration(duration);
        return clonedAnimation;
    }
}
