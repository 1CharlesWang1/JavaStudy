package Demos.Extends_demo.demo1;

public class Dog extends Animal{

    //无参构造器
    public Dog() {
        System.out.println("子类无参");
    }
    //有参构造器
    public Dog(int id,String name){
        super(id,name);
        System.out.println("子类有参");
    }

    @Override
    public void run(){
        System.out.println(super.getName()+"跑得快");
    }

    public void eat(String name){
        System.out.println(name+"比"+super.getName()+"吃得多");
    }

}
