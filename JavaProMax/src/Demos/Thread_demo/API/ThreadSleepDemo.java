package Demos.Thread_demo.API;

public class ThreadSleepDemo {
    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 5; i++) {
            System.out.println("输出"+i);
            if(i==3){
                //让线程休眠
                Thread.sleep(3000);
            }
        }

    }
}
