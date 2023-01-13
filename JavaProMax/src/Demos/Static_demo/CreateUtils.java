package Demos.Static_demo;

import java.util.Random;

public class CreateUtils {

    /**
     * 私有构造器
     */
    private CreateUtils() {
    }

    public static String createVerifyCode(int n) {
        String code = "";
        String data = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            int index = random.nextInt(data.length());
            code += data.charAt(index);
        }

        return code;
    }


    public static String toString(int[] arr) {

        if (arr == null) {
            return null;
        }
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            result += (i == arr.length - 1 ? arr[i] : arr[i] + ",");
        }
        result += "]";
        return result;
    }
}
