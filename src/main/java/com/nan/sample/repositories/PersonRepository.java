package com.nan.sample.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nan.sample.domain.Person;

/**
 * Created by mbart on 28.02.2016.
 */
public interface PersonRepository extends JpaRepository<Person, Long>{
    
}
