package io.firathamarat.restservice.service;

import io.firathamarat.restservice.model.Person;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

//implements yazdıktan sonra implements edilmeyen metodları implements etmek için alt + enter ile implements edilme işlemi yapılır

@Service
public class PersonServiceImpl implements PersonService {


    private Map<Integer, Person> personMap;

    @PostConstruct
    private void init(){
        personMap = new HashMap<>();

        Person person = new Person();
        person.setId(0);
        person.setName("Fırat");
        person.setSurname("Hamarat");
        person.setUsername("Spring");
        personMap.put(0, person);

    }

    @Override
    public Person getPersonById(int id) {

        if (personMap.containsKey(id)) {
            return personMap.get(id);
        }

        return new Person();
    }

    @Override
    public Map<Integer, Person> getPersonMap() {
        return personMap;
    }

    @Override
    public HttpStatus addPerson(Person person) {

        if(!personMap.containsKey(person.getId())){
            personMap.put(person.getId(), person);
            return HttpStatus.OK;
        }

        return HttpStatus.EXPECTATION_FAILED;
    }
}
