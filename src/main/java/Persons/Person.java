package Persons;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Person {
    private String name;
    private String email;
    private String currentAddress;
    private String permanentAddress;
}
