package Demos.Thread_demo.ThreadSafe;

public class ThreadDemo {
    public static void main(String[] args) {

        //定义线程类,创建一个共享账户对象
        Account account = new Account("ICBC-111",10000);

        //创建2个线程对象,代表两个人
        new DrawThread(account,"wcl").start();
        new DrawThread(account,"cyb").start();

    }
}
