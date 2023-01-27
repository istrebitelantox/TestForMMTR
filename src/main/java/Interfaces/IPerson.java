package Interfaces;

import Persons.Person;

import java.io.File;

public interface IPerson {
        Person person=new Person("Yuriy",
                "Gruzdev",
                "dareon@gmail.com",
                "Male",
                "9502458776",
                "06.09.2003",
                "Computer Science",
                "Sports",new File("src/main/resources/avatar.jpg"),
                "ул. Советская 29",
                "ул. Кукушкина 19",
                "Rajasthan",
                "Jaipur");
    }