package ua.com.nicole.javaspringboot.lesson_code.config.properties;

import lombok.Data;

@Data
public class Office {

    private String name;

    private String contactNumber;

    private Address address;
}
