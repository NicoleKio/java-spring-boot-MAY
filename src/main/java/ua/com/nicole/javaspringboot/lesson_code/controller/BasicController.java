package ua.com.nicole.javaspringboot.lesson_code.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @Autowired
    @Qualifier("demoBean2")
    private String demoBean;

    @GetMapping("/hello")
    public String hello() {
        return "Hello Nicole!";
    }

    @GetMapping("/hello-from/{name}")
    public String helloFrom(@PathVariable String name) {
        return "Hello from %s".formatted(name);
    }

    @GetMapping("/hello-to")
    public String helloTo(@RequestParam(required = false) String name) {
        return "Hello to %s".formatted(name);
    }

    @GetMapping("/demo-bean")
    public String demoBean() {
        return demoBean;
    }

}
