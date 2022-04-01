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

        @Column(length = 20000)
        @ApiModelProperty(value = "Mensagens")
        private String message;

        @Column(length = 10000)
        @ApiModelProperty(value = "Url Foto")
        private String urlfoto;

    }


