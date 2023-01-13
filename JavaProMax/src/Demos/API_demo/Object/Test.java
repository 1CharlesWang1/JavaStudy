package Demos.API_demo.Object;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {

        Student student1 = new Student(1,"wcl");
        Student student2 = new Student(1,"wcl");

        System.out.println(student1);
        System.out.println(student2);

        System.out.println(student1.equals(student2));
        System.out.println(Objects.equals(student1,student2));

    }
}
