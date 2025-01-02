package ua.com.nicole.javaspringboot.lesson_code.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.com.nicole.javaspringboot.lesson_code.config.properties.Office;
import ua.com.nicole.javaspringboot.lesson_code.config.properties.ReferenceData;

import java.util.List;

@RestController
@RequestMapping("/reference-data")
public class ReferenceDataController {

    @Autowired
    @Qualifier("demoBean1")
    private String demoBean;

    @Value("${reference-data.categories:cat1,cat2}")
    private List<String> categories;

    private ReferenceData referenceData;

    @GetMapping("/categories")
    public List<String> categories() {
        return categories;
    }

    @GetMapping("/demo-bean")
    public String demoBean() {
        return demoBean;
    }

    @GetMapping("/offices")
    public List<Office> offices() {
        return referenceData.getOffices();
    }

    @Autowired
    public void setReferenceData(ReferenceData referenceData) {
        this.referenceData = referenceData;
    }
}
