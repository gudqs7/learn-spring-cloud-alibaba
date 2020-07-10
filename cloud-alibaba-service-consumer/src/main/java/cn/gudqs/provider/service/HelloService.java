package cn.gudqs.provider.service;

import cn.gudqs.provider.service.impl.HelloServiceFallbackImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author wq
 */
@FeignClient(value = "hello-provider", fallback = HelloServiceFallbackImpl.class)
public interface HelloService {
    /**
     * echo
     *
     * @param name name
     * @return a word for say hi
     */
    @GetMapping("/hello/echo/{name}")
    String echo(@PathVariable String name, @RequestParam(value = "age", required = false) String age);

}
