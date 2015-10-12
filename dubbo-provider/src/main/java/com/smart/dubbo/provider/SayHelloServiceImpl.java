package com.smart.dubbo.provider;

import org.springframework.stereotype.Service;

import com.smart.dubbo.api.SayHelloService;

/**
 * @Description 
 * @author gaowenming
 */
@Service("sayHelloService")
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
