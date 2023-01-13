package Demos.Set_demo.Collection_demo.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Test {
    public static void main(String[] args) {

        Collection<Movie> movies = new ArrayList<>();
        movies.add(new Movie("战狼2",9.7));
        movies.add(new Movie("冰雪奇缘",9.5));
        movies.add(new Movie("僵尸世界大战",9.0));
        System.out.println(movies);

        //Collection不能用get(i)方法
//        for (int i = 0; i < movies.size(); i++) {
//            movies.get(i).getScore();
//        }

        for (Movie movie : movies) {
            System.out.println("------------------------");
            System.out.println("name:"+movie.getName());
            System.out.println("score:"+movie.getScore());
        }

    }
}
