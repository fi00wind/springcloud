package cn.coolwind.cloudDemo.user.controller;

import cn.coolwind.cloudDemo.user.feign.TestFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private TestFeign testFeign;

    @GetMapping("/")
    public String index() {
        return "this is user service!";
    }

    @GetMapping("getUser")
    public String getUser(@RequestParam("name") String name) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("user service arrive!");
        return "username is:" +name;
    }

    @GetMapping("getTest")
    public String getTest() {
        return testFeign.test();
    }

    public String fallback() {
        return "服务繁忙,请稍后再试！";
    }
}
