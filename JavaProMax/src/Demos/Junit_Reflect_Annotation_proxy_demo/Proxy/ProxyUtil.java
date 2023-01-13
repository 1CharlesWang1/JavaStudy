package Demos.Junit_Reflect_Annotation_proxy_demo.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {
    //静态方法,为用户业务对象返回一个代理对象
    public static <T> T getProxy(T obj) {
        /**
         * Proxy.newProxyInstance(obj.getClass().getClassLoader()
         * 实现接口 obj.getClass().getInterfaces()
         * 重写方法new InvocationHandler()
         */
        return (T) Proxy.newProxyInstance(obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(), new InvocationHandler() {
                    //重写代理方法中的内容
                    //method 正在调用的方法对象
                    //args 方法的属性
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        long startTime = System.currentTimeMillis();

                        //处罚对象的行为执行内容
                        Object rs = method.invoke(obj, args);

                        long endTime = System.currentTimeMillis();
                        System.out.println(method.getName() + "运行时间" + (endTime - startTime) / 1000.0 + "s");
                        return rs;
                    }
                });
    }
}
