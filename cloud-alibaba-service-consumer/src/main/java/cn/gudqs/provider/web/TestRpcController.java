package cn.gudqs.provider.web;

import cn.gudqs.provider.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author wq
 */
@RestController
@RequestMapping("/rpc")
public class TestRpcController {

    @Resource
    private RestTemplate restTemplate;
    @Resource
    private HelloService helloService;

    @GetMapping("/echo/{name}")
    public String echo(@PathVariable String name) {
        return restTemplate.getForObject("http://hello-provider/hello/echo/" + name, String.class);
    }

    @GetMapping("/feign/echo/{name}")
    public String echoByFeign(@PathVariable String name, String age) {
        return helloService.echo(name, age);
    }

}
