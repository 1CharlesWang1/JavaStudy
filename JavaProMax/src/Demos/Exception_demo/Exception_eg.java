package Demos.Exception_demo;

public class Exception_eg {
    public static void main(String[] args) throws AgeIllegalException {

        System.out.println("start");
        try {
            checkAge(-34);
        } catch (AgeIllegalException e) {
            e.printStackTrace();
        }
        System.out.println("end");

    }

    private static void checkAge(int age) throws AgeIllegalException {

        if(age<0||age>200){
            throw new AgeIllegalException(age + " is illegal");
        }else {
            System.out.println("success");
        }

    }
}
