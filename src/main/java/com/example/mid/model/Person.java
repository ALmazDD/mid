package com.example.mid.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="person")
public class Person {
    @Id
    private long id;
    private String firstname;
    private String lastname;
    private String city;
    private long phone;
    private long telegram;

}
