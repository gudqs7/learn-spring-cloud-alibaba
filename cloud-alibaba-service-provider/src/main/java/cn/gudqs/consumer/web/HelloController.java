package cn.gudqs.consumer.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.*;

/**
 * @author wq
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Value("${server.port}")
    private String port;
    @Autowired
    private ConfigurableApplicationContext applicationContext;

    @GetMapping("/echo/{name}")
    public String echo(@PathVariable String name, @RequestParam(value = "age", required = false) String age) {
        return "Hello, " + name + ", age: " + age + " ,on port: " + port;
    }

    @GetMapping("/name")
    public String printMyName() {
        return applicationContext.getEnvironment().getProperty("my.name");
    }

}
