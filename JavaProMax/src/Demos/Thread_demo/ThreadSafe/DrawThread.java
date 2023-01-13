package Demos.Thread_demo.ThreadSafe;

public class DrawThread extends Thread{
    private Account account;
    public DrawThread(Account account ,String name){
        super(name);
        this.account=account;
    }

    @Override
    public void run() {
        account.drawMoney2(10000);
    }
}
