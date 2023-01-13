package Demos.Junit_Reflect_Annotation_proxy_demo.Reflect.FrameworkDemo;

public class Student {
    private String name;
    private int age;
    private String major;

    public Student() {
    }

    public Student(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
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

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return major
     */
    public String getMajor() {
        return major;
    }

    /**
     * 设置
     * @param major
     */
    public void setMajor(String major) {
        this.major = major;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + ", major = " + major + "}";
    }
}
