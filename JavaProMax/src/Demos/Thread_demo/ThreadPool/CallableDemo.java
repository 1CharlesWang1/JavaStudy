package Demos.Thread_demo.ThreadPool;

import java.util.concurrent.*;

public class CallableDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        //创建任务池
        ExecutorService pool = new ThreadPoolExecutor(3,5,6,
                TimeUnit.SECONDS,new ArrayBlockingQueue<>(3), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());

        //给任务线程处理
        Future<String> f1 = pool.submit(new MyCallable(100));
        Future<String> f2 = pool.submit(new MyCallable(200));
        Future<String> f3 = pool.submit(new MyCallable(300));
        Future<String> f4 = pool.submit(new MyCallable(400));

        System.out.println(f1.get());
        System.out.println(f2.get());
        System.out.println(f3.get());
        System.out.println(f4.get());

    }
}
