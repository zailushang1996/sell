package com.imooc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author LiuZX liuzhixiang
 * DATE   2018/10/19
 */
@RunWith(SpringRunner.class)
public class LoggerTest {

    private final Logger logger = LoggerFactory.getLogger(LoggerTest.class);


    @Test
    public void test1() {
        String name = "liuzhxiiang";
        String password = "123456";
        logger.debug("debug");
        logger.info("info");
        logger.error("error");
        logger.info("name:{},password:{}",name,password);
    }
}
