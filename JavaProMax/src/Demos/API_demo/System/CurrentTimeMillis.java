package Demos.API_demo.System;

public class CurrentTimeMillis {
    public static void main(String[] args) {
        //1970-1-1 到现在的毫秒值
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            System.out.println(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println((endTime-startTime)/1000.0+"s");
    }
}
