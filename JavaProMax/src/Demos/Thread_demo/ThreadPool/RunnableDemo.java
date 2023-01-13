package Demos.Thread_demo.ThreadPool;

import java.util.concurrent.*;

public class RunnableDemo {
    public static void main(String[] args) {

        //创建线程对象
        ExecutorService pool = new ThreadPoolExecutor(3,5,6,
                TimeUnit.SECONDS,new ArrayBlockingQueue<>(3), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());

        Runnable target = new MyRunnable();

        //三个核心线程
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);

        //进入等待队列
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);

        //创建临时线程
        pool.execute(target);
        pool.execute(target);

        //超出异常
        pool.execute(target);

    }
}
