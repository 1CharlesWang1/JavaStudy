package Demos.Thread_demo.ThreadTest;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class ThreadDemo3 {

    /**
     * 返回对象的线程 Callable
     * @param args
     */
    public static void main(String[] args) {
        //创建Callable任务对象
        Callable<String> call = new MyCallable(100);
        //把Callable任务对象交给FutureTask
        FutureTask<String> f1 = new FutureTask<>(call);
        //交给线程处理
        Thread t1 = new Thread(f1);
        //启动
        t1.start();

        Callable<String> call2 = new MyCallable(200);
        FutureTask<String> f2 = new FutureTask<>(call);
        Thread t2 = new Thread(f2);
        t2.start();

        try {
            String rs1 = f1.get();
            System.out.println("第一个结果" + rs1);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            String rs2 = f2.get();
            System.out.println("第二个结果" + rs2);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

class MyCallable implements Callable<String> {
    private int n;

    public MyCallable(int n) {
        this.n = n;
    }

    @Override
    public String call() throws Exception {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum += i;
        }
        return "子线程结果"+sum;
    }
}