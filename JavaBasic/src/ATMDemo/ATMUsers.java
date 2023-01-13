package ATMDemo;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class ATMUsers {

    /**
     * 主类
     *
     * @param args
     */
    public static void main(String[] args) {

        ArrayList<Account> accounts = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        RegisterAndLogin(scanner, accounts);

    }

    /**
     * @param scanner
     * @param accounts
     */
    private static void RegisterAndLogin(Scanner scanner, ArrayList<Account> accounts) {


        while (true) {
            Separator();
            System.out.println("1.注册");
            System.out.println("2.登录");
            System.out.println("请选择:");
            String i = scanner.next();
            switch (i) {
                case "1":
                    accounts = Register(scanner, accounts);
                    break;
                case "2":
                    accounts = Login(scanner, accounts);
                    break;
                default:
                    System.out.println("输入错误");
            }
        }

    }

    /**
     * 注册
     *
     * @param scanner
     * @param accounts
     * @return
     */
    private static ArrayList<Account> Register(Scanner scanner, ArrayList<Account> accounts) {
        Separator();
        Account account = new Account();
        System.out.println("用户名:");
        String username = scanner.next();
        account.setUsername(username);

        System.out.println("密码:");
        String password = scanner.next();
        account.setPassword(password);

        Random random = new Random();
        String id = "";
        for (int i = 0; i < 10; i++) {
            int ch = random.nextInt(10);
            id = ch + id;
        }

        account.setId(id);
        accounts.add(account);
        System.out.println("添加成功!卡号为:" + account.getId());

        return accounts;
    }

    /**
     * 登录
     *
     * @param scanner
     * @param accounts
     */
    private static ArrayList<Account> Login(Scanner scanner, ArrayList<Account> accounts) {

        while (true) {
            Separator();
            Account account = null;

            if (accounts.size() == 0) {
                System.out.println("无用户,先注册");
                return accounts;
            }

            System.out.println("卡号:");
            String id = scanner.next();

            System.out.println("密码:");
            String password = scanner.next();

            for (int i = 0; i < accounts.size(); i++) {
                account = accounts.get(i);
                if ((account.getId().equals(id)) && (account.getPassword().equals(password))) {
                    System.out.println("登录成功!");
                    accounts = Menu(scanner, account, accounts);
                    return accounts;
                } else {
                    System.out.println("卡号或密码不正确");
                    System.out.println("请重新输入:");
                }
            }
        }

    }

    /**
     * 菜单界面
     *
     * @param scanner
     * @param account  本用户
     * @param accounts 所有用户
     */
    private static ArrayList<Account> Menu(Scanner scanner, Account account, ArrayList<Account> accounts) {
        while (true) {
            Separator();
            System.out.println("1.查询");
            System.out.println("2.存钱");
            System.out.println("3.取钱");
            System.out.println("4.转账");
            System.out.println("5.修改密码");
            System.out.println("6.退出");
            System.out.println("7.销户");
            System.out.println("请输入操作:");

            int i = scanner.nextInt();
            switch (i) {
                case 1:
                    selectAccount(scanner, account);
                    break;
                case 2:
                    account = saveMoney(scanner, account);
                    break;
                case 3:
                    account = withdrawMoney(scanner, account);
                    break;
                case 4:
                    accounts = transferAccounts(scanner, account, accounts);
                    break;
                case 5:
                    account = updatePassword(scanner, account);
                    break;
                case 6:
                    return accounts;
                case 7:
                    accounts = cancelAccount(account, accounts);
                    return accounts;
                default:
                    System.out.println("输入错误");

            }
        }
    }


    /**
     * 转账
     *
     * @param scanner
     * @param account
     * @param accounts
     * @return
     */
    private static ArrayList<Account> transferAccounts(Scanner scanner, Account account, ArrayList<Account> accounts) {

        while (true) {
            Separator();

            if (accounts.size() < 2) {
                System.out.println("用户不足2人,无法转账");
                break;
            }

            System.out.println("请输入转账卡号:");
            String id = scanner.next();

            for (int i = 0; i < accounts.size(); i++) {
                if (account.getId().equals(id)) {
                    System.out.println("不可以给自己转账");
                    break;
                }
                if (accounts.get(i).getId().equals(id)) {
                    //王晨乐
                    String username = accounts.get(i).getUsername();
                    System.out.println("确认");
                    System.out.println("*" + username.substring(1));
                    System.out.println("请输入对方姓氏:");
                    String inputName = scanner.next();
                    if (username.startsWith(inputName)) {
                        System.out.println("输入转账金额:");
                        int money = scanner.nextInt();
                        accounts.get(i).setMoney(accounts.get(i).getMoney() + money);
                        account.setMoney(account.getMoney() - money);
                        System.out.println("转账" + money + "成功");
                        return accounts;
                    } else {
                        System.out.println("姓氏错误");
                        System.out.println("重新输入:");
                        break;
                    }
                }
                if (i == accounts.size() - 1) {
                    System.out.println("找不到用户");
                    break;
                }
            }
        }
        return accounts;
    }

    /**
     * 修改密码
     *
     * @param scanner
     * @param account
     * @return
     */
    private static Account updatePassword(Scanner scanner, Account account) {

        while (true) {
            Separator();
            System.out.println("输入旧密码:");
            String password = scanner.next();

            if (password.equals(account.getPassword())) {
                System.out.println("输入新密码:");
                String newPassword = scanner.next();
                account.setPassword(newPassword);
                System.out.println("修改成功!");
                return account;
            } else {
                System.out.println("密码错误");
                System.out.println("重新输入");
            }
        }
    }


    /**
     * 查询
     *
     * @param scanner
     * @param account
     */
    private static void selectAccount(Scanner scanner, Account account) {

        Separator();
        System.out.println("查询如下:");
        System.out.println("卡号:" + account.getId());
        System.out.println("用户名:" + account.getUsername());
        System.out.println("余额:" + account.getMoney());

    }

    /**
     * 存钱
     *
     * @param scanner
     * @param account
     * @return
     */
    private static Account saveMoney(Scanner scanner, Account account) {
        Separator();
        System.out.println("请输入存钱金额:");
        int i = scanner.nextInt();

        account.setMoney(i + account.getMoney());

        System.out.println("已存:" + i);
        System.out.println("余额:" + account.getMoney());

        return account;
    }

    /**
     * 取钱
     *
     * @param scanner
     * @param account
     * @return
     */
    private static Account withdrawMoney(Scanner scanner, Account account) {

        Separator();
        System.out.println("请输入取钱金额:");
        int i = scanner.nextInt();

        account.setMoney(account.getMoney() - i);

        System.out.println("已取:" + i);
        System.out.println("余额:" + account.getMoney());

        return account;
    }

    /**
     * 销户
     *
     * @param account
     * @param accounts
     * @return
     */
    private static ArrayList<Account> cancelAccount(Account account, ArrayList<Account> accounts) {

        Separator();
        accounts.remove(account);
        System.out.println("销户成功!");
        return accounts;

    }


    /**
     * 分隔符
     */
    static void Separator() {
        System.out.println("================================");
    }
}
