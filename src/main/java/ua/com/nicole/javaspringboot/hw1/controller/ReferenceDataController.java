package ua.com.nicole.javaspringboot.hw1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.com.nicole.javaspringboot.hw1.properties.CarService;

import java.util.List;

@RestController
@RequestMapping("/car-data")
public class ReferenceDataController {

    @Value("${car-data.engine-types}")
    private List<String> engineTypes;

    @Value("${car-data.fuel-types}")
    private List<String> fuelTypes;

    private CarService carService;

    @GetMapping("/engine-types")
    public List<String> engineTypes() {
        return engineTypes;
    }

    @GetMapping("/fuel-types")
    public List<String> fuelTypes() {
        return fuelTypes;
    }

    @GetMapping("/fuel-types/{type}")
    public List<String> fuelType(@PathVariable String type) {
        return fuelTypes;
    }
}
