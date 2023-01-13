package Demos.Set_demo.Collection_demo.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class CollectionErgodic {
    public static void main(String[] args) {

        Collection<String> list = new ArrayList();
        list.add("123");
        list.add("hhh");
        list.add("啊啊啊");

        System.out.println(list);

        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("-------------------");
        int[] arr = {1,2,3};
        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println("-------------------");

        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        System.out.println("-------------------");
        list.forEach(s->System.out.println(s));

    }
}
