package Demos.Set_demo.Collection_demo.Sort;

import java.util.*;

public class Test {
    public static void main(String[] args) {

        List<Apple> apples = new ArrayList<>();

        apples.add(new Apple("红富士", 15.5, 20));
        apples.add(new Apple("红蛇果", 16.5, 24));
        apples.add(new Apple("绿蛇果", 13.5, 22));

        /*Collections.sort(apples, new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
//                return Double.compare(o1.getWeight(),o2.getWeight());
                return o1.getNumber()- o2.getNumber();
            }
        });
        System.out.println(apples);*/

        Collections.sort(apples, (Apple o1, Apple o2) -> o1.getNumber() - o2.getNumber());
        System.out.println(apples);
    }
}
