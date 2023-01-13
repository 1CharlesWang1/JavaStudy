package Demos.Stream_demo;

import java.util.*;
import java.util.stream.Stream;

public class GainStream {
    public static void main(String[] args) {

        //Collection集合获取流
        Collection<String> list = new ArrayList<>();
        java.util.stream.Stream<String> s =list.stream();

        //Map集合获取流
        Map<String,Integer> maps = new HashMap<>();
        //键流
        Stream<String> keyStream = maps.keySet().stream();
        //值流
        Stream<Integer> valueStream = maps.values().stream();
        //键值对流
        Stream<Map.Entry<String, Integer>> KeyValueStream = maps.entrySet().stream();


        //数组流
        String[] names = {"1","2","3"};
        Stream<String> stream1 = Arrays.stream(names);
        Stream<String> stream2 = Stream.of(names);

    }
}
