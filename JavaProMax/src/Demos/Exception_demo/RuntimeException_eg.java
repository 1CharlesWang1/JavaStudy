package Demos.Exception_demo;

public class RuntimeException_eg {
    public static void main(String[] args) {

        System.out.println("start");
        try {
            checkAge(-34);
        } catch (AgeIllegalRuntimeException e) {
            e.printStackTrace();
        }
        System.out.println("end");

    }

    private static void checkAge(int age) {

        if(age<0||age>200){
            throw new AgeIllegalRuntimeException(age + " is illegal");
        }else {
            System.out.println("success");
        }

    }
}
