package Demos.Interface_demo;

public class Test {
    public static void main(String[] args) {
        Athlete athlete = new Athlete("wcl");
        athlete.play();
        athlete.run();
        athlete.price();
        Sport.eat();
    }
}
