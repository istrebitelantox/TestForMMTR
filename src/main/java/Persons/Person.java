package Persons;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Person {
    private String firstName;
    private String lastName;
    private String mobile;

    private String email;
    private String currentAddress;
    private String permanentAddress;
}
