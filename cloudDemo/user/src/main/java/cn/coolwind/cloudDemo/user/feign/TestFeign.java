package cn.coolwind.cloudDemo.user.feign;

import cn.coolwind.cloudDemo.user.fallback.TestFallback;
import cn.coolwind.clouddemo.api.service.TestService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "cloudDemo-test",fallback = TestFallback.class)
public interface TestFeign extends TestService {

}
