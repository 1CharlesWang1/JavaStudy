package Demos.Thread_demo.Timer;

import java.util.Date;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TimerDemo1 {
    public static void main(String[] args) {

        //创建新线程
        ScheduledExecutorService pool = Executors.newScheduledThreadPool(3);

        /**
         * 开启定时任务
         * initialDelay:初始延迟
         * period:时间间隔
         */
        pool.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"执行输出:AAA"+new Date());
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        },0,2, TimeUnit.SECONDS);

        pool.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"执行输出:BBB"+new Date());
            }
        },0,2, TimeUnit.SECONDS);


    }
}
