package com.nan.sample.service;

import java.util.List;

import com.nan.sample.domain.Person;

/**
 * Created by mbart on 28.02.2016.
 */
public interface PersonService {

    List<Person> loadAll();

    void saveSamplePerson(Person person);

}
