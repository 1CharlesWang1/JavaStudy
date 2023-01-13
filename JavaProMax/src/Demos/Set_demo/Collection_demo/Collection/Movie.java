package Demos.Set_demo.Collection_demo.Collection;

public class Movie {
    private String name;
    private double score;


    public Movie() {
    }

    public Movie(String name, double score) {
        this.name = name;
        this.score = score;
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
     * @return score
     */
    public double getScore() {
        return score;
    }

    /**
     * 设置
     * @param score
     */
    public void setScore(double score) {
        this.score = score;
    }

    public String toString() {
        return "Movie{name = " + name + ", score = " + score + "}";
    }
}
