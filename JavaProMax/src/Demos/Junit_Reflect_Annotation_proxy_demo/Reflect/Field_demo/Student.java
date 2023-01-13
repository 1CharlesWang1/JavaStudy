package Demos.Junit_Reflect_Annotation_proxy_demo.Reflect.Field_demo;

public class Student {
    private String name;
    private int age;
    public static String schoolName;
    public static final String COUNTRY="CHN";


    public Student() {
    }

    public Student(String name, int age, String schoolName, String COUNTRY) {
        this.name = name;
        this.age = age;
        this.schoolName = schoolName;
    }

    /**
     * 获取
     * @return schoolName
     */
    public static String getSchoolName() {
        return schoolName;
    }

    /**
     * 设置
     * @param schoolName
     */
    public static void setSchoolName(String schoolName) {
        Student.schoolName = schoolName;
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

    public String toString() {
        return "Student{name = " + name + ", age = " + age + ", schoolName = " + schoolName + ", COUNTRY = " + COUNTRY + "}";
    }
}
