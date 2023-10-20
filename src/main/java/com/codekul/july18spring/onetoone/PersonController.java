package com.codekul.july18spring.onetoone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private AdharRepository adharRepository;

    @PostMapping("savePerson")
    private String savePerson(@RequestBody Person person){
        Person person1 = new Person();
        person1.setName(person.getName());
        Person person2 = personRepository.save(person1);

        Adhar adhar = new Adhar();
        adhar.setAdharNumber(person.getAdhar().getAdharNumber());
        adhar.setPerson(person2);

        adharRepository.save(adhar);
        return "Person saved.";

    }
}

/**
 *
 * {
 *     "name":"Raj",
 *     "adhar":{
 *         "adharNumber":3429832984
 *     }
 * }
 */