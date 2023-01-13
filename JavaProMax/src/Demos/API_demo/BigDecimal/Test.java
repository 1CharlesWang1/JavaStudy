package Demos.API_demo.BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Test {
    public static void main(String[] args) {

        double a = 2.0;
        double b = 3.0;
        BigDecimal a1 = BigDecimal.valueOf(a);
        BigDecimal b1 = BigDecimal.valueOf(b);
        BigDecimal c1 = a1.add(b1);
//        BigDecimal c2 = a1.subtract(b1);
//        BigDecimal c3 = a1.multiply(b1);
//        BigDecimal c4 = a1.divide(b1);

        double rs = c1.doubleValue();
        System.out.println(rs);

        BigDecimal a11 = BigDecimal.valueOf(2.0);
        BigDecimal b11 = BigDecimal.valueOf(3.0);
        BigDecimal c11 = a11.divide(b11,3, RoundingMode.HALF_UP);
        System.out.println(c11);
    }
}
