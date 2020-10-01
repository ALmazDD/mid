package com.example.mid.repository;

import com.example.mid.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {
    Person findById(long id);
    Person deleteById(long id);

}
