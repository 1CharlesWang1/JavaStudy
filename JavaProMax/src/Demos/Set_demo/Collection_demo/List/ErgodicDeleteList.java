package Demos.Set_demo.Collection_demo.List;

import java.util.*;

public class ErgodicDeleteList {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("123");
        list.add("456");
        list.add("qwe");
        list.add("qwe");
        list.add("asd");

        System.out.println(list);

        //迭代器删除
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String ele = iterator.next();
            if("qwe".equals(ele)){
                iterator.remove();
            }
        }
        System.out.println(list);

        //for i删除
        for (int i = 0; i < list.size(); i++) {
            String ele = list.get(i);
            if("qwe".equals(ele)){
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }
}
