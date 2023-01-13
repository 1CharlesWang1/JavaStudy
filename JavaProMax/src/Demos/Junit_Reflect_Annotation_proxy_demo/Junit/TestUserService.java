package Demos.Junit_Reflect_Annotation_proxy_demo.Junit;

import org.junit.*;

/**
 * 单元测试
 * void类型不返回值
 * 用@Test注解
 */
public class TestUserService {

    //方法前后
    @Before
    public void before(){
        System.out.println("==before==");
    }

    @After
    public void after(){
        System.out.println("==after==");
    }

    //类前后
    @BeforeClass
    public static void BeforeClass(){
        System.out.println("==BeforeClass==");
    }

    @AfterClass
    public static void AfterClass(){
        System.out.println("==AfterClass==");
    }


    @Test
    public void testLoginName(){
        UserService userService = new UserService();
        String rs = userService.loginName("admin","123");

        //进行预期结果正确性测试:断言
        Assert.assertEquals("出现问题!","登陆成功!",rs);
    }

    @Test
    public void testSelectNames(){
        UserService userService = new UserService();
        userService.selectNames();
    }
}
