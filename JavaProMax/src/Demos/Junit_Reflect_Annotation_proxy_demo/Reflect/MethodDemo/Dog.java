package Demos.Junit_Reflect_Annotation_proxy_demo.Reflect.MethodDemo;

public class Dog {
    private String name;

    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }

    public void run(){
        System.out.println("run");
    }

    public void eat(){
        System.out.println("eat bones");
    }

    private String eat(String name){
        System.out.println(name+"eat bones");
        return "好吃!";
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Dog{name = " + name + "}";
    }
}
