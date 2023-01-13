package Demos.Thread_demo.ThreadSafe;

public class Account {
    private String name;
    private int money;

    public Account() {
    }

    public Account(String name, int money) {
        this.name = name;
        this.money = money;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return money
     */
    public int getMoney() {
        return money;
    }

    /**
     * 设置
     *
     * @param money
     */
    public void setMoney(int money) {
        this.money = money;
    }

    public String toString() {
        return "Account{name = " + name + ", money = " + money + "}";
    }

    public void drawMoney1(int money) {
        String name = Thread.currentThread().getName();
        synchronized (this) {
            if (this.money >= money) {
                System.out.println(name + "取钱" + money);
                this.money -= money;
                System.out.println("剩余" + this.money);
            } else {
                System.out.println(name + "取钱,余额不足");
            }
        }
    }


    public synchronized void drawMoney2(int money) {
        String name = Thread.currentThread().getName();
        if (this.money >= money) {
            System.out.println(name + "取钱" + money);
            this.money -= money;
            System.out.println("剩余" + this.money);
        } else {
            System.out.println(name + "取钱,余额不足");
        }
    }
}
