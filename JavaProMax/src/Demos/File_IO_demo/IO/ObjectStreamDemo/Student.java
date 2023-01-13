package Demos.File_IO_demo.IO.ObjectStreamDemo;

import java.io.Serializable;

public class Student implements Serializable {

    private static final long serialVersionID = 1;
    private String name;
    private String sex;
    private transient String password;


    public Student() {
    }

    public Student(String name, String sex, String password) {
        this.name = name;
        this.sex = sex;
        this.password = password;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置
     *
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 获取
     *
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    public String toString() {
        return "Student{name = " + name + ", sex = " + sex + ", password = " + password + "}";
    }
}
