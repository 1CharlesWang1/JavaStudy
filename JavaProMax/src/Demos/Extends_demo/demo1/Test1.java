package Demos.Extends_demo.demo1;

import Demos.Extends_demo.demo2.Student;

public class Test1 {
    public static void main(String[] args) {

        Dog dog = new Dog();

        System.out.println("-------");

        Dog dog1 = new Dog(1, "吉娃娃");
        System.out.println(dog1.getId());
        System.out.println(dog1.getName());
        dog1.run();
        dog1.eat("老虎");

        Student student = new Student();

    }

}
