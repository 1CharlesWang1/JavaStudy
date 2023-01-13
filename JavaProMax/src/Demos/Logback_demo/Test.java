package Demos.Logback_demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {
    public static final Logger LOGGER = LoggerFactory.getLogger("Test.class");
    public static void main(String[] args) {

        try {
            LOGGER.debug("Main开始");
            LOGGER.info("第二行日志");
            int a=10;
            int b=0;
            LOGGER.trace("a="+a);
            LOGGER.trace("b="+b);
            LOGGER.info("result="+a/b);
        }catch (Exception e){
            LOGGER.error("异常:"+e);
        }
    }
}
