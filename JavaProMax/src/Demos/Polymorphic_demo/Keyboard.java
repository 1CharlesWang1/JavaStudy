package Demos.Polymorphic_demo;

public class Keyboard implements USB{

    private String name;

    public Keyboard(String name) {
        this.name = name;
    }

    public void onclick(){
        System.out.println("单击键盘");
    }

    @Override
    public void connect() {
        System.out.println(name+"已连接");
    }

    @Override
    public void disconnect() {
        System.out.println(name+"已断开");
    }
}
