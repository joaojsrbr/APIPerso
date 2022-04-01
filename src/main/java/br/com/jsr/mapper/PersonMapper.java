package br.com.jsr.mapper;


import br.com.jsr.dto.request.PersonDTO;
import br.com.jsr.entity.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);
    
    Person toModel(PersonDTO personDTO);

    PersonDTO toDTO(Person person);
}
