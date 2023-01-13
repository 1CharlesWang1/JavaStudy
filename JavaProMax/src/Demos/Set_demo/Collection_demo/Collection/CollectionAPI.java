package Demos.Set_demo.Collection_demo.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionAPI {
    public static void main(String[] args) {

        Collection collection = new ArrayList<>();
        Collection collection2 = new ArrayList<>();
        collection.add(123);
        collection2.add("qwe");
//        arrayList.clear();
        System.out.println(collection.contains(123));

        collection2.addAll(collection);
        System.out.println(collection);
        System.out.println(collection2);


    }
}
