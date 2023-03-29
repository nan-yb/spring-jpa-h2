package com.nan.sample.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nan.sample.domain.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{
    
}
