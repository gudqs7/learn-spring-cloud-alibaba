package cn.gudqs.provider.service.impl;

import cn.gudqs.provider.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * @author wq
 */
@Service
public class HelloServiceFallbackImpl implements HelloService {

    @Override
    public String echo(String name, String age) {
        return "Oh, Sorry, service not work!";
    }
}
