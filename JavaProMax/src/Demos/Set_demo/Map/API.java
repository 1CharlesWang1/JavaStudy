package Demos.Set_demo.Map;

import java.util.*;

public class API {
    public static void main(String[] args) {

        Map<String, Integer> maps1 = new HashMap<>();
        Map<String, Integer> maps2 = new HashMap<>();

        maps1.put("Java", 1);
        maps1.put("Css", 3);
        maps1.put("HTML", 2);


        maps2.put("Css1", 6);
        maps2.put("HTML1", 8);

        //根据键找值
        System.out.println(maps1.get("Java"));

        //去除
        maps1.remove("Java");
//        maps.clear();

        //包含
        System.out.println(maps1.containsKey("Cpp"));
        System.out.println(maps1.containsValue(2));

        //判空
        System.out.println(maps1.isEmpty());

        System.out.println(maps1.size());

        //键集合
        Set<String> keys = maps1.keySet();
        System.out.println(keys);

        //值集合
        Collection<Integer> values = maps1.values();
        System.out.println(values);

        //全部覆盖添加
        maps1.putAll(maps2);

        System.out.println(maps1);
        System.out.println(maps2);


    }
}
