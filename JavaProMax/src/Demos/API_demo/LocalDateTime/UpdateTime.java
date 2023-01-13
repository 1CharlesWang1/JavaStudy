package Demos.API_demo.LocalDateTime;

import java.time.*;

public class UpdateTime {
    public static <localDateTime, localDate> void main(String[] args) {

        //日期
        LocalDate nowDate = LocalDate.now();
        System.out.println(nowDate);
        //时间
        LocalTime nowTime = LocalTime.now();
        System.out.println(nowTime);

        //日期时间
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println(localDateTime.minusHours(1));
        System.out.println(localDateTime.plusDays(1));

        LocalDate birthdayDate = LocalDate.of(2002,8,11);

        System.out.println("今天是2002年8月11日吗?"+ nowDate.equals(birthdayDate));
        System.out.println("今天在2002年8月11日后吗"+nowDate.isAfter(birthdayDate));
        System.out.println("今天在2002年8月11日前吗"+nowDate.isBefore(birthdayDate));

        MonthDay birMd=MonthDay.of(birthdayDate.getMonthValue(),birthdayDate.getDayOfMonth());
        MonthDay nowMd=MonthDay.from(nowDate);
        System.out.println("今天是生日吗?"+birMd.equals(nowMd));

    }
}
