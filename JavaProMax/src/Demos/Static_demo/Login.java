package Demos.Static_demo;

public class Login {
    //
    public static void main(String[] args) {
        String code = CreateUtils.createVerifyCode(5);
        System.out.println(code);

        int[] arr1=null;
        int[] arr2= {1,2,3};
        int[] arr3= {};

        System.out.println(CreateUtils.toString(arr1));
        System.out.println(CreateUtils.toString(arr2));
        System.out.println(CreateUtils.toString(arr3));

        String a= CreateUtils.toString(arr2);
        a=a.substring(1);
        a=a.substring(0,a.length()-1);
        String[] b=a.split(",");
        System.out.println(b);
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}
