package Demos.Interface_demo;

public class Athlete implements Food, Sport {
    private String name;

    public Athlete(String name) {
        this.name = name;
    }

    @Override
    public void price() {
        System.out.println("pricePrice");
    }

    @Override
    public void run() {
        System.out.println("runRun");
    }

    @Override
    public void play() {
        Sport.super.play();
    }
}
