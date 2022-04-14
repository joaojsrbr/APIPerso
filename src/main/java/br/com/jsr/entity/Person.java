package br.com.jsr.entity;


import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;
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


//        @Lob
//        @ApiModelProperty(value = "horario")
//        private LocalTime horario;


        @Lob
        @DateTimeFormat(pattern = "dd-MM-yyyy")
        @ApiModelProperty(value = "data")
        @Basic(optional = false)
        @Column(insertable = false, updatable = false)
        @Temporal(TemporalType.TIMESTAMP)
        private LocalDateTime data;

    }


