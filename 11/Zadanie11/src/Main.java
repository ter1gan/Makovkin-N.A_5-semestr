public class Main {
    public static void main(String[] args) {
        AnimationManager animationManager = new AnimationManager();

        Animation fadeIn = animationManager.createFadeInAnimation(1500);
        fadeIn.animate(); 

        Animation slideIn = animationManager.createSlideInAnimation(600);
        slideIn.animate();
    }
}

