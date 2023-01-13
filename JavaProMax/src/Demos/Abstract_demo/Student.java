package Demos.Abstract_demo;

public abstract class Student {

    public final void write(){
        System.out.println("\t\t\t\t 《标题》");
        System.out.println(writeMain());
        System.out.println("结尾");
    }

    abstract String writeMain();

}
