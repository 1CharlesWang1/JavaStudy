package ATMDemo;

public class Account {
    private String id;
    private String username;
    private String password;
    private int money;

    public Account() {
    }

    public Account(String id, String username, String password, int money) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.money = money;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
