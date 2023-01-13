package Demos.Set_demo.Collection_demo.Doudizhu;

public class Card {
    private String size;
    private String color;
    private int index;

    public Card() {
    }

    public Card(String size, String color, int index) {
        this.size = size;
        this.color = color;
        this.index = index;
    }

    /**
     * 获取
     *
     * @return size
     */
    public String getSize() {
        return size;
    }

    /**
     * 设置
     *
     * @param size
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * 获取
     *
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置
     *
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * 获取
     *
     * @return index
     */
    public int getIndex() {
        return index;
    }

    /**
     * 设置
     *
     * @param index
     */
    public void setIndex(int index) {
        this.index = index;
    }

    public String toString() {
        return color + size;
    }
}
