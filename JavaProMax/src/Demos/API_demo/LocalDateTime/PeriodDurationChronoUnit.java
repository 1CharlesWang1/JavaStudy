package Demos.API_demo.LocalDateTime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodDurationChronoUnit {
    public static void main(String[] args) {

        LocalDate today1 = LocalDate.now();
        System.out.println(today1);

        LocalDate birthday = LocalDate.of(2002,8,11);
        System.out.println(birthday);

        Period period = Period.between(birthday,today1);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

        System.out.println("-------------------------------");
        LocalDateTime today2= LocalDateTime.now();
        System.out.println(today2);
        LocalDateTime birthdayDate = LocalDateTime.of(2002,8,11,20,00,00);
        System.out.println(birthdayDate);

        Duration duration = Duration.between(birthdayDate,today2);
        System.out.println(duration.toDays());
        System.out.println(duration.toHours());
        System.out.println(duration.toMillis());

        System.out.println("-------------------------------");
        System.out.println(ChronoUnit.YEARS.between(birthdayDate, today2));
        System.out.println(ChronoUnit.MONTHS.between(birthdayDate, today2));
        System.out.println(ChronoUnit.WEEKS.between(birthdayDate, today2));
        System.out.println(ChronoUnit.DAYS.between(birthdayDate, today2));
        System.out.println(ChronoUnit.HOURS.between(birthdayDate, today2));
        System.out.println(ChronoUnit.DECADES.between(birthdayDate, today2));
        System.out.println(ChronoUnit.HALF_DAYS.between(birthdayDate, today2));
        System.out.println(ChronoUnit.CENTURIES.between(birthdayDate, today2));
    }
}
