package MovieAppDemo.Bean;

public class Business extends User{
    private String shopName;

    private String address;

    /**
     * 获取
     * @return shopName
     */
    public String getShopName() {
        return shopName;
    }

    /**
     * 设置
     * @param shopName
     */
    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    /**
     * 获取
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

}
