package cn.coolwind.cloudDemo.user.fallback;

import cn.coolwind.cloudDemo.user.feign.TestFeign;
import org.springframework.stereotype.Component;

@Component
public class TestFallback implements TestFeign {
    public String test() {
        return "test service fallback by class!";
    }
}
