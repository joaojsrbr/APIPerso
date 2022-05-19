package br.com.jsr.controller;


import br.com.jsr.dto.request.PersonDTO;
import br.com.jsr.dto.response.MessageResponseDTO;
import br.com.jsr.exception.PersonNotFoundException;
import br.com.jsr.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import javax.validation.Valid;
import java.util.List;

@EnableSwagger2
@RestController
@RequestMapping("/api/v1/")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PersonController {

    private PersonService personService;



    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createPerson(@RequestBody @Valid PersonDTO personDTO) {
    return personService.createPerson(personDTO);
    }


    @GetMapping
    public List<PersonDTO> listAll() {
    return personService.listAll();
}


    @GetMapping("/{id}")
    public PersonDTO findById(@PathVariable Long id) throws PersonNotFoundException {
    return personService.findById(id);
}


    @PutMapping("/{id}")
    public MessageResponseDTO updateById(@PathVariable Long id, @RequestBody @Valid PersonDTO personDTO) throws PersonNotFoundException {
        return personService.updateById(id, personDTO);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Long id) throws PersonNotFoundException {
        personService.delete(id);
    }
}



