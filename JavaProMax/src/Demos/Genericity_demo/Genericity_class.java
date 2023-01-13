package Demos.Genericity_demo;

import java.util.ArrayList;

public class Genericity_class {
    public static void main(String[] args) {

        MyArrayList<String> list1=new MyArrayList<>();
        list1.add("Java");
        list1.add("Mysql");
        list1.add("Mybatis");
        System.out.println(list1);

        MyArrayList<Integer> list2=new MyArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        System.out.println(list2);

    }
    public static class MyArrayList<E> {
        private ArrayList lists = new ArrayList();

        public void add(E e) {
            lists.add(e);
        }

        public void remove(E e) {
            lists.remove(e);
        }

        public String toString() {
            return lists.toString();
        }
    }

}













