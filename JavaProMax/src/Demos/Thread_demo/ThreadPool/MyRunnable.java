package Demos.Thread_demo.ThreadPool;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+"输出了"+i);
        }
        System.out.println(Thread.currentThread().getName()+"本任务休眠了");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
