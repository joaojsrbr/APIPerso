package br.com.jsr.entity;


import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Person {

        @Id
        @Lob
        @ApiModelProperty(value = "ID")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Lob
        @ApiModelProperty(value = "titulo")
        private String titulo;

        @Lob
        @ApiModelProperty(value = "message")
        private String message;

        @Lob
        @ApiModelProperty(value = "Url Foto")
        private String urlfoto;

        @NotNull
        @Lob
        @ApiModelProperty(value = "horario")
        private LocalTime horario;

        @NotNull
        @Lob
        @Column(unique = true)
        @DateTimeFormat(pattern = "dd-MM-yyyy")
        @ApiModelProperty(value = "data")
        private LocalDateTime data;

    }


