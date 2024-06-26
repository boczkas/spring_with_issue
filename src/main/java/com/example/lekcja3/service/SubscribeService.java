package com.example.lekcja3.service;

import com.example.lekcja3.model.Person;

import java.util.ArrayList;
import java.util.List;

public class SubscribeService {

    List<String> names = new ArrayList<>();
    List<Person> persons = new ArrayList<>();

    public void addName(String name) {
        names.add(name);
    }

    public List<String> getNames() {
        return names;
    }

    public void addPerson(Person person) {
        persons.add(person);
    }

    public List<Person> getPersons() {
        return persons;
    }
}
