package gosk.szymon.controllers;

import gosk.szymon.models.Person;
import gosk.szymon.repositories.PersonRepository;
import org.jetbrains.annotations.Contract;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonsController {

    private final PersonRepository repository;

    @Contract(pure = true)
    public PersonsController(PersonRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/persons")
    public List<Person> allPersons() {
        return repository.findAll();
    }

    @GetMapping("/persons/{id}")
    public Person singlePerson(@PathVariable Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new PersonNotFoundException(id));
    }

    @PostMapping("/persons")
    public Person newPerson(@RequestBody Person newPerson) {
        return repository.save(newPerson);
    }

    @PutMapping("/persons/{id}")
    public Person replacePerson(@RequestBody Person newPerson, @PathVariable Long id) {
        return repository.findById(id)
                .map(person -> {
                    person.setName(newPerson.getName());
                    person.setSurname(newPerson.getSurname());
                    person.setClassType(newPerson.getClassType());
                    person.setClassLevel(newPerson.getClassLevel());
                    return repository.save(person);
                })
                .orElseGet(() -> {
                    newPerson.setId(id);
                    return repository.save(newPerson);
                });
    }

    @DeleteMapping("/persons/{id}")
    void deletePerson(@PathVariable Long id) {
        repository.deleteById(id);
    }

}
