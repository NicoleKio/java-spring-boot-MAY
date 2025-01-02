package ua.com.nicole.javaspringboot.lesson_code.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    public final Integer demoBean;


    public DemoController(Integer demoBean) {
        this.demoBean = demoBean;
    }

    @GetMapping("/bean")
    public Integer bean() {
        return demoBean;
    }
}
