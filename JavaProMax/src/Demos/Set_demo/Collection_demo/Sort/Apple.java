package Demos.Set_demo.Collection_demo.Sort;

public class Apple {
    private String name;
    private double weight;
    private int number;

    public Apple() {
    }

    public Apple(String name, double weight, int number) {
        this.name = name;
        this.weight = weight;
        this.number = number;
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
     * @return weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * 设置
     * @param weight
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * 获取
     * @return number
     */
    public int getNumber() {
        return number;
    }

    /**
     * 设置
     * @param number
     */
    public void setNumber(int number) {
        this.number = number;
    }

    public String toString() {
        return "Apple{name = " + name + ", weight = " + weight + ", number = " + number + "}";
    }
}
