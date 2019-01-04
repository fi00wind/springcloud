package cn.coolwind.cloudDemo.test.controller;

import cn.coolwind.cloudDemo.test.feign.UserFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private UserFeign userFeign;

    @GetMapping("/")
    public String index() {
        return "this is test service";
    }
    @GetMapping("test")
    public String test() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("test service arrive!");
        return "This is test message!";
    }

    @GetMapping("getUser")
    public String getUser(String name) {

        return userFeign.getUser(name);
    }

    public String fallback(String name) {
        return "系统繁忙，请稍后再试！";
    }
}
