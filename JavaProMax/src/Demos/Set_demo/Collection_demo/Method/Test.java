package Demos.Set_demo.Collection_demo.Method;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        sum(10);
        sum(10,20,30);
        sum(new int[]{10,20,30,40});

    }

    public static void sum(int...nums) {
        System.out.println("个数"+nums.length);
        System.out.println("内容"+ Arrays.toString(nums));
    }
}
