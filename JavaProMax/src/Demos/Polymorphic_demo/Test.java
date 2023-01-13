package Demos.Polymorphic_demo;

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer("Dell");
        computer.start();

        USB Keyboard = new Keyboard("联想键盘");
        computer.installUSB(Keyboard);

        USB Mouse = new Mouse("罗技鼠标");
        computer.installUSB(Mouse);

        computer.shutdown();
    }
}
