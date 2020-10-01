package com.example.mid.controller;

import com.example.mid.model.Person;
import com.example.mid.service.PersonService;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@Controller
@RestController
@AllArgsConstructor
public class PersonController {
    private PersonService personService;



    @RequestMapping("/")
    public String getHome(){
        return "index";
    }

    @PostMapping("/api/v2/users/")
    public ResponseEntity<?> createPerson(@RequestBody Person person){
        return ResponseEntity.ok(personService.save(person));
    }
    @PutMapping("/api/v2/users/")
    public ResponseEntity<?> updatePerson(@RequestBody Person person){
        return ResponseEntity.ok(personService.save(person));
    }

    @GetMapping("/api/v2/users/")
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(personService.getAll());
    }

    @DeleteMapping("/api/v2/users/{id}")
    public void deleteById(@PathVariable Long id){
        personService.deleteById(id);
    }

}
