package br.com.jsr.entity;


import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Person {

        @Id
        @ApiModelProperty(value = "ID")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @ApiModelProperty(value = "Mensagens")
        @Column(nullable = false)
        private String message;


    }


