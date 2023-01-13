package Demos.Extends_demo.demo2;


/**
 * this用法
 */
public class Student {

    private int id;
    private String name;

    public Student() {
    }

    /**
     * 两个有参构造器
     * @param id
     */
    public Student(int id) {
        this(id,"wcl");
    }
    public Student(int id, String name) {
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
