package io.firathamarat.restservice.service;

import io.firathamarat.restservice.model.Person;
import org.springframework.http.HttpStatus;

import java.util.Map;

public interface PersonService {

    Person getPersonById(int id);


    Map<Integer, Person> getPersonMap();

    HttpStatus addPerson(Person person);

}
