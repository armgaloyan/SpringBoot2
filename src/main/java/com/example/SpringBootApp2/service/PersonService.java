package com.example.SpringBootApp2.service;



import com.example.SpringBootApp2.models.Person;

import java.util.List;

public interface PersonService {

    List<Person> index();

    Person show(int id);

    void save(Person person);

    void update(int id, Person updatedPerson);

    void deleteUser(int id);
}
