package Demos.Regex_demo;

import java.util.Scanner;

public class Regex {
    public static void main(String[] args) {

        /*
        [a-z&&[^bc]]   a-z除bc

        \d      [0-9]
        \D      [^0-9]
        \w      [a-zA-Z_0-9]
        \W      [^\w]
        .       任何字符
        \s      空白字符
        \S      非空白


        N?      0,1
        N+      1,N
        N*      0,N
        A{N}    N
        A{N,M}  N-M
        A{N,}   至少N

         */

        Scanner sc = new Scanner(System.in);
        while (true) {
            //13309263937
            System.out.println("手机号:");
            String phone = sc.next();
            if(phone.matches("1[3-9]\\d{9}")){
                System.out.println("正确");
                break;
            }else {
                System.out.println("错误");
            }
        }

        while (true) {
            System.out.println("邮箱:");
//            962893714@qq.com  [a-zA-Z0-9]
            String email = sc.next();
            if(email.matches("\\w{1,20}@([a-zA-Z0-9]{2,5}\\.\\w{1,3}){1,2}")){
                System.out.println("正确");
                break;
            }else {
                System.out.println("错误");
            }
        }

        while (true) {
            //029-82290641
            System.out.println("座机:");
            String phone = sc.next();
            if(phone.matches("0\\d{2}-?82\\d{6}")){
                System.out.println("正确");
                break;
            }else {
                System.out.println("错误");
            }
        }

    }
}
