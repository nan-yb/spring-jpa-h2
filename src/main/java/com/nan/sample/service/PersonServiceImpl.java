package com.nan.sample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nan.sample.domain.Person;
import com.nan.sample.repositories.PersonRepository;

import java.util.List;

/**
 * Created by mbart on 28.02.2016.
 */
@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public List<Person> loadAll() {
        return personRepository.findAll();
    }

    @Override
    public void saveSamplePerson(Person person) {
        personRepository.save(new Person("Hans", "Meiser"));
        personRepository.save(new Person("Peter", "Lustig"));
    }

}
