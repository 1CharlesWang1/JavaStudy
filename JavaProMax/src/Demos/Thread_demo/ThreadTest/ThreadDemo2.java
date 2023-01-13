package Demos.Thread_demo.ThreadTest;

public class ThreadDemo2 {

    public static void main(String[] args) {

        //创建任务对象
        Runnable target = new Runnable(){

            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("子线程:"+i);
                }
            }
        };
        //把任务对象交给Thread处理
        Thread t = new Thread(target);
        //启动
        t.start();

        //启动
        new Thread(()-> {
                for (int i = 0; i < 5; i++) {
                    System.out.println("子线程3:"+i);
                }
        }).start();



        for (int i = 0; i < 5; i++) {
            System.out.println("主线程:"+i);
        }
    }
}

