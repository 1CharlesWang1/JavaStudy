package MovieAppDemo.Bean;

import java.util.Date;

public class Movie {
    private String name;
    private String actor;
    private double time;
    private double price;
    private int number;
    private Date startTime;

    public Movie() {
    }

    public Movie(String name, String actor, double time, double price, int number, Date startTime) {
        this.name = name;
        this.actor = actor;
        this.time = time;
        this.price = price;
        this.number = number;
        this.startTime = startTime;
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
     * @return actor
     */
    public String getActor() {
        return actor;
    }

    /**
     * 设置
     * @param actor
     */
    public void setActor(String actor) {
        this.actor = actor;
    }

    /**
     * 获取
     * @return time
     */
    public double getTime() {
        return time;
    }

    /**
     * 设置
     * @param time
     */
    public void setTime(double time) {
        this.time = time;
    }

    /**
     * 获取
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
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

    /**
     * 获取
     * @return startTime
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 设置
     * @param startTime
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public String toString() {
        return "Movie{name = " + name + ", actor = " + actor + ", time = " + time + ", price = " + price + ", number = " + number + ", startTime = " + startTime + "}";
    }
}
