package Demos.Stream_demo;

public class Staff {
    private String name;
    private double salary;
    private double bonus;

    public Staff() {
    }

    public Staff(String name, double salary, double bonus) {
        this.name = name;
        this.salary = salary;
        this.bonus = bonus;
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
     * @return salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * 设置
     * @param salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * 获取
     * @return bonus
     */
    public double getBonus() {
        return bonus;
    }

    /**
     * 设置
     * @param bonus
     */
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String toString() {
        return "Staff{name = " + name + ", salary = " + salary + ", bonus = " + bonus + "}";
    }
}
