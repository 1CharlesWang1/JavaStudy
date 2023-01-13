package Demos.API_demo.StringBuilder;

public class Test {
    public static void main(String[] args) {

        StringBuilder s = new StringBuilder();
        s.append("123").append("hhh").append(456);
        System.out.println(s);

        int[] arr1 = null;
        System.out.println(arrayToString(arr1));

        int[] arr2 = {1,2,3};
        System.out.println(arrayToString(arr2));

    }

    public static String arrayToString(int[] arr) {
        if(arr != null){
            StringBuilder s = new StringBuilder("[");
            for (int i = 0; i < arr.length; i++) {
                s.append(arr[i]).append(i==arr.length-1?"":",");
            }
            s.append("]");
            return s.toString();
        }else {
            return null;
        }
    }
}
