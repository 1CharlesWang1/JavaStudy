package Demos.Polymorphic_demo;

public class Mouse implements USB{

    private String name;

    public Mouse(String name) {
        this.name = name;
    }

    public void onclick(){
        System.out.println("单击鼠标");
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
