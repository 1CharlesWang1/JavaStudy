package Demos.InnerClass_demo.Anonymous;

public class Test implements Swimming{
    public static void main(String[] args) {

        //匿名内部类
        Swimming student=new Swimming() {
            @Override
            public void swim() {
                System.out.println("学生游泳");
            }
        };
        go(student);

        Swimming student2=new Swimming() {
            @Override
            public void swim() {
                System.out.println("学生游泳");
            }
        };
        go(student);



        //简略写法
        go(new Swimming() {
            @Override
            public void swim() {
                System.out.println("运动员游泳");
            }
        });


    }

    public static void go(Swimming swimming) {
        System.out.println("开始");
        swimming.swim();
        System.out.println("结束");
    }

    @Override
    public void swim() {

    }

//    @Override
//    public String count(int i) {
//        return function.apply(i);
//    }
}


