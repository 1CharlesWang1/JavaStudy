package Demos.Set_demo.Collection_demo.Doudizhu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

    //新牌几何容器
    public static List<Card> cards = new ArrayList<>();

    //定义新牌
    static {
        String[] sizes = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2",};
        String[] colors = {"♥", "♦", "♠", "♣"};
        int index = 0;
        for (String size : sizes) {
            index++;
            for (String color : colors) {
                Card c = new Card(size, color, index);
                cards.add(c);
            }
        }
        Card c1 = new Card("", "小王", ++index);
        Card c2 = new Card("", "大王", ++index);
        Collections.addAll(cards, c1, c2);
    }

    public static void main(String[] args) {

        //洗牌
        System.out.println(cards);
        Collections.shuffle(cards);
        System.out.println(cards);

        //玩家集合
        List<Card> wcl = new ArrayList<>();
        List<Card> cyb = new ArrayList<>();
        List<Card> wsy = new ArrayList<>();
        List<Card> finalCards = new ArrayList<>();

        //发牌
        for (int i = 0; i < cards.size() - 3; i++) {
            if (i % 3 == 0) {
                wcl.add(cards.get(i));
            }
            if (i % 3 == 1) {
                cyb.add(cards.get(i));
            }
            if (i % 3 == 2) {
                wsy.add(cards.get(i));
            }
        }
        //底牌
//        for (int i = cards.size()-3; i < cards.size(); i++) {
//            finalCard.add(cards.get(i));
//        }

        finalCards = cards.subList(cards.size() - 3, cards.size());

        //排序
        sortCard(wcl);
        sortCard(cyb);
        sortCard(wsy);

        System.out.println("wcl" + wcl);
        System.out.println("cyb" + cyb);
        System.out.println("wsy" + wsy);
        System.out.println("底牌" + finalCards);

//        wcl.addAll(finalCards);
//        System.out.println(wcl);

    }

    private static void sortCard(List<Card> cards) {
        Collections.sort(cards, (o1, o2) -> o2.getIndex() - o1.getIndex());
    }
}
