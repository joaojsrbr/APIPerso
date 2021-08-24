package br.com.jsr.service;

import br.com.jsr.dto.MessageResponseDTO;
import br.com.jsr.entity.Person;
import br.com.jsr.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class PersonService {
    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }
    public MessageResponseDTO createPerson(Person person) {
        Person savedPerson = personRepository.save(person);
        return MessageResponseDTO.builder().message("Pessoa criada com id " + savedPerson.getId()).build();
    }
    public List<Person> findAll() {
        return personRepository.findAll();

    }




}
