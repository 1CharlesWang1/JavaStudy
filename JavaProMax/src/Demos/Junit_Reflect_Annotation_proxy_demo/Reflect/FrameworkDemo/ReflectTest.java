package Demos.Junit_Reflect_Annotation_proxy_demo.Reflect.FrameworkDemo;

/**
 * 利用框架存储不同对象
 */
public class ReflectTest {
    public static void main(String[] args) {
        //学生对象
        Student student = new Student();
        student.setName("wcl");
        student.setAge(20);
        student.setMajor("Computer");
        MybatisUtil.save(student);

//        老师对象
        Teacher teacher = new Teacher();
        teacher.setName("ccy");
        teacher.setAge(30);
        teacher.setSalary(10000);
        MybatisUtil.save(teacher);
    }
}
