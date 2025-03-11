package AdapterDesingPatterns;

public class BirdAdapter {

    Bird bird;
    public BirdAdapter(Bird bird){
        this.bird = bird;
    }

    public void squeak() {
        bird.makeSound();
    }
}
