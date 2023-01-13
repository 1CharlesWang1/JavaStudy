package Demos.API_demo.LocalDateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormat {
    public static void main(String[] args) {
        LocalDateTime ldt= LocalDateTime.now();
        System.out.println(ldt);
        System.out.println(ldt.getMonth().getValue());

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss EEE a");
        System.out.println(dtf.format(ldt));

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime ldt2 = LocalDateTime.parse("2022-08-11 11:11:11",dtf2);
        System.out.println(ldt2);
        System.out.println(ldt2.format(dtf));
        System.out.println(ldt2.getYear());
    }
}
