package Demos.Extends_demo.demo2;

public class Test2 {
    public static void main(String[] args) {

        Student student1 =new Student(1,"cyb");
        System.out.println(student1.getId());
        System.out.println(student1.getName());

        Student student2 =new Student(2);
        System.out.println(student2.getId());
        System.out.println(student2.getName());

    }
}
