package com.example.mid.service;

import com.example.mid.model.Person;
import com.example.mid.repository.PersonRepository;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PersonService {
    private  PersonRepository personRepository;



    public List<Person> getAll() {
        return (List<Person>) personRepository.findAll();
    }

    public Person save(Person person){
        return personRepository.save(person);
    }

    public void deleteById(Long id) {
        personRepository.deleteById(id);
    }
}
