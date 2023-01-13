package Demos.OOP_demo;

public class Test {
    public static void main(String[] args) {
        Movie m1 = new Movie("长津湖","吴京");
        Movie m2 = new Movie("你的名字","太君");
        Movie[] movies = new Movie[2];
        movies[0]=m1;
        movies[1]=m2;
        for (int i = 0; i < movies.length; i++) {
            System.out.println("电影名:"+movies[i].getName());
            System.out.println("导演:"+movies[i].getDirector());
            System.out.println("---------");
        }
    }
}
