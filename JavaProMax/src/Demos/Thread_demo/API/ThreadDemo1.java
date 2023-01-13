package Demos.Thread_demo.API;

public class ThreadDemo1 {
    //main方法由主线程负责调度
    public static void main(String[] args) {

        Thread t1 = new MyThread("1号");
        t1.start();
        System.out.println(t1.getName());

        Thread t2 = new MyThread("2号");
        t2.start();
        System.out.println(t2.getName());

        //哪个线程执行,就得到哪个对象(当前线程对象)
        //主线程为main
        Thread m = Thread.currentThread();
        System.out.println(m.getName());

        for (int i = 0; i < 5; i++) {
            System.out.println("main线程输出"+i);
        }
    }
}


