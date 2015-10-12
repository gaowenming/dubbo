package com.smart.dubbo.provider;

import com.smart.dubbo.api.SayHelloService;

/**
 * @Description 
 * @author gaowenming
 */
public class SayHelloServiceImpl implements SayHelloService {

    /**
     * @Description 
     * @param name
     */
    @Override
    public void sayHelloWorld(String name) {
        System.out.println("Hello:" + name);

    }

}
