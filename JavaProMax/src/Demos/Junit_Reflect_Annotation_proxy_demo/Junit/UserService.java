package Demos.Junit_Reflect_Annotation_proxy_demo.Junit;

/**
 * 业务方法
 */
public class UserService {
    public String loginName(String loginName,String password){
        if ("admin".equals(loginName)&&"123".equals(password)){
            return "登陆成功!";
        }else {
            return "用户名或密码不正确!";
        }
    }

    public void selectNames(){
        System.out.println(10/2);
        System.out.println("查询成功!");
    }
}
