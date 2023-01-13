package Demos.Polymorphic_demo;

public class Computer {

    private String name;

    public Computer(String name) {
        this.name = name;
    }

    public void installUSB(USB usb){
        //可以调用公有方法
        usb.connect();
        //私有方法需要判断后才可以调用
        if (usb instanceof Keyboard){
            Keyboard keyboard = (Keyboard) usb;
            keyboard.onclick();
        } else if (usb instanceof Mouse) {
            Mouse mouse = (Mouse) usb;
            mouse.onclick();
        }
        usb.disconnect();
    }

    public void start() {
        System.out.println(name+"开机");
    }

    public void shutdown() {
        System.out.println(name+"关机");
    }
}
