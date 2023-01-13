package Demos.Junit_Reflect_Annotation_proxy_demo.Proxy;

public class Test {
    public static void main(String[] args) {
        //使用动态代理解决问题
        UserService userService = ProxyUtil.getProxy(new UserServiceImpl());
        System.out.println(userService.login("admin","123"));
        userService.deleteUsers();
    }


}
