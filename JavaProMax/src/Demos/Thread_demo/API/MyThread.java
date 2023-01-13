package Demos.Thread_demo.API;

import org.jetbrains.annotations.NotNull;

public class MyThread extends Thread{

    public MyThread() {
    }

    public MyThread(@NotNull String name) {
        super(name);
    }

    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+"线程输出"+i);
        }
    }

    public String toString() {
        return "MyThread{}";
    }
}
