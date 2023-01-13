package Demos.Static_demo;

import java.util.ArrayList;

public class StaticBlock {

    public static ArrayList<Integer> cards = new ArrayList<>();
    static {
        int[] size={1,2,3,4,5};

        cards.add(size[0]);
        cards.add(size[2]);
        cards.add(size[1]);

    }

    public static void main(String[] args) {
        System.out.println(cards);
    }
}
