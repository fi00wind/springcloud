package cn.coolwind.clouddemo.api.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface UserService {

    @GetMapping("/getUser")
    String getUser(@RequestParam("name") String name);
}
