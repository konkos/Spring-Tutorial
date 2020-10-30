package com.example.demo.dao;

import com.example.demo.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("postgres")
public class PersonDataAccessService implements PersonDao {
    @Override
    public int insertPerson(UUID id, Person person) {
        return 0;
    }

    @Override
    public List<Person> selectAllPeople() {
        List<Person> people = new ArrayList<>();
        people.add(new Person(UUID.randomUUID(),"FROM POSTGRES DB"));
        return people;
    }

    @Override
    public Optional<Person> selectPersonById(UUID uuid) {
        return Optional.empty();
    }

    @Override
    public int deletePersonById(UUID uuid) {
        return 0;
    }

    @Override
    public int updatePersonById(UUID uuid, Person person) {
        return 0;
    }
}
