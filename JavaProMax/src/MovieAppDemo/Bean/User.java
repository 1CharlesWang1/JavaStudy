package MovieAppDemo.Bean;

public class User {
    private String username;
    private String realName;
    private String password;
    private char sex;
    private String phone;
    private double money;

    public User() {
    }

    public User(String username, String realName, String password, char sex, String phone, double money) {
        this.username = username;
        this.realName = realName;
        this.password = password;
        this.sex = sex;
        this.phone = phone;
        this.money = money;
    }

    /**
     * 获取
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     * @return realName
     */
    public String getRealName() {
        return realName;
    }

    /**
     * 设置
     * @param realName
     */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return sex
     */
    public char getSex() {
        return sex;
    }

    /**
     * 设置
     * @param sex
     */
    public void setSex(char sex) {
        this.sex = sex;
    }

    /**
     * 获取
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取
     * @return money
     */
    public double getMoney() {
        return money;
    }

    /**
     * 设置
     * @param money
     */
    public void setMoney(double money) {
        this.money = money;
    }

    public String toString() {
        return "User{username = " + username + ", realName = " + realName + ", password = " + password + ", sex = " + sex + ", phone = " + phone + ", money = " + money + "}";
    }
}
