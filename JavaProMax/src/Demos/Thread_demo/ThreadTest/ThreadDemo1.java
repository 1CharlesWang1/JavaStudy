package Demos.Thread_demo.ThreadTest;

public class ThreadDemo1 {
    /**
     * 继承Thread
     * @param args
     */
    public static void main(String[] args) {

        //new 新线程对象
        Thread t = new MyThread();
        //调用start方法启动线程
        t.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("主线程:"+i);
        }
    }
}

class MyThread extends Thread{
    /**
     * 重写run方法,定义线程
     */
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程:"+i);
        }
    }
}
