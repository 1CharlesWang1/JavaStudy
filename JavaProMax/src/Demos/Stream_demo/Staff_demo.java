package Demos.Stream_demo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Staff_demo {

    public static double allMoney;

    public static void main(String[] args) {

        List<Staff> list1 = new ArrayList<>();
        list1.add(new Staff("王晨乐", 3000, 2000));
        list1.add(new Staff("王舜宇", 2000, 1000));
        list1.add(new Staff("下井开", 1000, 500));

        List<Staff> list2 = new ArrayList<>();
        list2.add(new Staff("程义镔", 300, 200));
        list2.add(new Staff("万张淘", 200, 100));
        list2.add(new Staff("王行中", 100, 50));

        Optional<Staff> max = list1.stream().max((e1, e2) ->
                Double.compare(e1.getBonus() + e1.getSalary(), e2.getBonus() + e2.getSalary()));
        System.out.println(max);

        Stream<Staff> s1 = list1.stream();
        Stream<Staff> s2 = list2.stream();
        Stream<Staff> s3 = Stream.concat(s1, s2);

        s3.sorted((e1, e2) ->
                        Double.compare(e1.getBonus() + e1.getSalary(), e2.getBonus() + e2.getSalary()))
                .skip(1).limit(list1.size() + list2.size() - 2)
                .forEach(e -> {
                    allMoney += (e.getSalary() + e.getBonus());
                });

        BigDecimal a = BigDecimal.valueOf(allMoney);
        BigDecimal b = BigDecimal.valueOf(list1.size()+list2.size()-2);
        System.out.println("平均"+a.divide(b,2, RoundingMode.HALF_UP));


    }
}
