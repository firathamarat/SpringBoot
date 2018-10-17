package io.firathamarat.restservice.controller;

import io.firathamarat.restservice.model.Person;
import io.firathamarat.restservice.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping(value = "/get/id/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    Person getPersonById(@PathVariable("id") int id){

       return personService.getPersonById(id);
    }

    @RequestMapping(value = "get/map", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    Map<Integer, Person> getPersonMap(){
        return personService.getPersonMap();
    }

    @RequestMapping(value = "post", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public HttpStatus addPerson(@RequestBody Person person){
        return personService.addPerson(person);
    }


}
