package Persons;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Employee {
    private String firstName;
    private String lastName;
    private String email;
    private String age;
    private String salary;
    private String department;
}