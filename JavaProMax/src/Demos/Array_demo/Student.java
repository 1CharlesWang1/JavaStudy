package Demos.Array_demo;

public class Student {

    private int id;
    private String name;

    private double hight;

    public Student(int id, String name, double hight) {
        this.id = id;
        this.name = name;
        this.hight = hight;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hight=" + hight +
                '}';
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

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }
}
