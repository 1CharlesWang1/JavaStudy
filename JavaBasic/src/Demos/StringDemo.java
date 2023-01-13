package Demos;

import static com.sun.org.apache.xalan.internal.lib.ExsltStrings.split;

public class StringDemo {
    public static void main(String[] args) {

        String a = "好好学习,abc,天天向上!";

        System.out.println(a.substring(3));
        System.out.println(a.substring(3,6));

        System.out.println(a.charAt(3));

        System.out.println(a.replace("好好", "hh"));

        System.out.println(a.contains("好好"));

        System.out.println(a.startsWith("好好"));

        System.out.println(a.toUpperCase());

        int[] abcd={1,2,3};
        System.out.println(abcd);

        String[] split = a.split(",");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }

    }
}
