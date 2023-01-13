package Demos.Stream_demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class API {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        list.add("wcl");
        list.add("cyb");
        list.add("xjk");
        list.add("wsy");
        list.add("ws");

        list1.addAll(list);

        list.stream().filter(s -> s.startsWith("w")).forEach(System.out::println);
        System.out.println("------------------------");
        list.stream().filter(s -> s.length() == 3).forEach(System.out::println);
        System.out.println("------------------------");

        //limit 前n个
        list.stream().limit(2).forEach(System.out::println);
        System.out.println("------------------------");

        //skip 跳过
        list.stream().skip(2).forEach(System.out::println);
        System.out.println("------------------------");

        //distinct去重
        list.stream().distinct().forEach(System.out::println);
        System.out.println("------------------------");

        //count个数
        System.out.println(list.stream().count());
        System.out.println("------------------------");

        //map
        //集合前面加元素
        list.stream().map(s->"hhh:"+s).forEach(System.out::println);
        System.out.println("------------------------");

        //concat 合并
        Stream<String> w1 = list.stream().filter(s -> s.startsWith("w"));
        Stream<String> w2 = list.stream().filter(s -> s.length() == 3);


        Stream<String> w3 = Stream.concat(w1,w2);
        w3.forEach(System.out::println);

    }
}
