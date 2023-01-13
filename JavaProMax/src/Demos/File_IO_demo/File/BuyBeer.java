package Demos.File_IO_demo.File;

public class BuyBeer {

    public static int totalNumber;

    public static int lastCapNumber;

    public static int lastBottleNumber;

    /**
     * 1瓶酒2块钱
     * 4个瓶盖换1瓶
     * 2个瓶子换1瓶
     * 10元钱买几瓶酒
     * @param args
     */
    public static void main(String[] args) {

        buy(100);
        System.out.println("总啤酒"+totalNumber);
        System.out.println("剩瓶盖"+lastCapNumber);
        System.out.println("剩瓶子"+lastBottleNumber);
    }

    private static void buy(int money) {
        //直接买的瓶数
        int buyNumber=money/2;
        totalNumber+=buyNumber;

        //瓶子和盖子换的钱
        int capNumber= lastCapNumber+buyNumber;
        int bottleNumber = lastBottleNumber+buyNumber;

        int allMoney = 0;
        allMoney+=(capNumber/4)*2;
        lastCapNumber=capNumber%4;
        allMoney+=(bottleNumber/2)*2;
        lastBottleNumber=bottleNumber%2;
        if(allMoney>=2){
            buy(allMoney);
        }
    }
}
