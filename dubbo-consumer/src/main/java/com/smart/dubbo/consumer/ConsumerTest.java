package com.smart.dubbo.consumer;
import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.smart.dubbo.api.SayHelloService;

/**
 * @Title ConsumerTest.java
 * @Package
 * @author gaowenming
 * @date 2015年10月12日 下午3:32:04
 * @version V1.0
 */

/**
 * @Description 
 * @author gaowenming
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:applicationContext.xml", "classpath*:applicationContext-*.xml" })
public class ConsumerTest {

    @Resource
    private SayHelloService sayHelloService;

    @Test
    public void test() throws Exception {
        sayHelloService.sayHelloWorld("jack");
    }

}
