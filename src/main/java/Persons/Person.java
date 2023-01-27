package Persons;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.File;

@AllArgsConstructor
@Getter
public class Person {
    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    private String mobile;
    private String dateOfBirth;
    private String subject;
    private String hobie;
    public File avatar;
    private String currentAddress;
    private String permanentAddress;
    private String state;
    private String city;
}
