package Demos.Junit_Reflect_Annotation_proxy_demo.Proxy;

public class UserServiceImpl implements UserService{
    @Override
    public String login(String username, String password) {
        System.out.println("登陆成功!");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "登陆成功!";
    }

    @Override
    public void deleteUsers() {
        System.out.println("删除成功!");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
