package Demos.Interface_demo;

public interface Sport {

    void run();

    default void play() {
        System.out.println("playPlay");
    }

    static void eat() {
        System.out.println("eatEat");
    }

}
