package Demos.API_demo.LocalDateTime;

import java.util.Date;

public class Date_demo {
    public static void main(String[] args) {

        Date date1 = new Date();
        long d1= date1.getTime();
        System.out.println(d1);

        for (int i = 0; i < 9999; i++) {
            System.out.println(i);;
        }

        Date date2 = new Date();
        long d2= date2.getTime();
        System.out.println((d2-d1)/1000.0);

    }
}
