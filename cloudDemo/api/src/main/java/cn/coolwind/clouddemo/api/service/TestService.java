package cn.coolwind.clouddemo.api.service;

import org.springframework.web.bind.annotation.GetMapping;

public interface TestService {

    @GetMapping("test")
    String test();
}
