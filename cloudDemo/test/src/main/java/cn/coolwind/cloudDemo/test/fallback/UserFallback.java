package cn.coolwind.cloudDemo.test.fallback;

import cn.coolwind.cloudDemo.test.feign.UserFeign;
import org.springframework.stereotype.Component;

@Component
public class UserFallback implements UserFeign {
    public String getUser(String name) {
        return "User fallback message by class";
    }
}
