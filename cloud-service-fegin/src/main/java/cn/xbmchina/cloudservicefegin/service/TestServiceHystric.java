package cn.xbmchina.cloudservicefegin.service;

import org.springframework.stereotype.Component;

@Component
public class TestServiceHystric implements  TestService{
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
