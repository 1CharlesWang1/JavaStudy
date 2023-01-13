package Demos.Regex_demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Array {
    public static void main(String[] args) {
        String names = "王晨乐ifdjiafn王舜宇dfghjklrtyujvbn程义镔";
        String[] arr = names.split("\\w+");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        String rs= "23123一二三四五六七13309263937"+"962893714@qq.com,qwdqdw13309262787";
        String regex = "(1[3-9]\\d{9})|\\w{1,20}@([a-zA-Z0-9]{2,5}\\.\\w{1,3}){1,2}";
        //匹配对象
        Pattern pattern = Pattern.compile(regex);
        //内容匹配器对象
        Matcher matcher = pattern.matcher(rs);

        while (matcher.find()){
            String rs1=matcher.group();
            System.out.println(rs1);
        }
    }
}
