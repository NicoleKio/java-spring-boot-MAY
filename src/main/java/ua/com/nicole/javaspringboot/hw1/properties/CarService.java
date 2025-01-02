package ua.com.nicole.javaspringboot.hw1.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
@ConfigurationProperties(prefix = "car-data")
public class CarService {

    private List<Engine> engineTypes;

    private List<Fuel> fuelTypes;
}
