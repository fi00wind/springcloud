package cn.coolwind.cloudDemo.test.feign;

import cn.coolwind.cloudDemo.test.fallback.UserFallback;
import cn.coolwind.clouddemo.api.service.UserService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "cloudDemo-user",fallback = UserFallback.class)
public interface UserFeign extends UserService {
}
