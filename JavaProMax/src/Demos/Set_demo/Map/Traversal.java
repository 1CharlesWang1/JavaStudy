package Demos.Set_demo.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class Traversal {
    public static void main(String[] args) {

        Map<String, Integer> maps1 = new HashMap<>();

        maps1.put("Java", 1);
        maps1.put("Css", 3);
        maps1.put("HTML", 2);

        maps1.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String k, Integer v) {
                System.out.println(k + "-->" + v);
            }
        });

        maps1.forEach((k, v) -> {
            System.out.println(k + "-->" + v);
        });

    }
}
