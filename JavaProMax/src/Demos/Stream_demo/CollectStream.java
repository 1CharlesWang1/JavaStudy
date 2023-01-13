package Demos.Stream_demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectStream {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("wcl");
        list.add("wsy");
        list.add("cyb");
        list.add("xjk");

        //流变List集合
        Stream<String> s1 = list.stream().filter(s -> s.startsWith("w"));
        List<String> list1 = s1.collect(Collectors.toList());
        System.out.println(list1);

        //流只能用一次
        //流变Set集合
        Stream<String> s2 = list.stream().filter(s -> s.startsWith("w"));
        Set<String> set = s2.collect(Collectors.toSet());
        System.out.println(set);

        Stream<String> s3 = list.stream().filter(s -> s.startsWith("w"));
        Object[] arr = s3.toArray();
        System.out.println(Arrays.toString(arr));

    }
}
