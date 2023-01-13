package Demos.Extends_demo.demo1;


/**
 * 无参有参构造器用法
 */
public class Animal {

    private int id;
    private String name;

    public void run(){
        System.out.println(name+"跑得快");
    }

    public Animal() {
        System.out.println("父类无参");
    }

//    public String count(int i){
//
//
//    };

    public Animal(int id, String name) {
        System.out.println("父类有参");
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
