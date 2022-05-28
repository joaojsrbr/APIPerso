package br.com.jsr.entity;


import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Person {

        @Id
        @NotBlank
        @ApiModelProperty(value = "ID")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @ApiModelProperty(value = "Primeiro Nome")
        @NotBlank
        @Column(nullable = false)
        private String firstName;

        @ApiModelProperty(value = "Último Nome")
        @NotBlank
        @Column(nullable = false)
        private String lastName;

//        @ApiModelProperty(value = "CPF")
//        @Column(nullable = false, unique = true)
//        private String cpf;

        @Column(name = "created_at")
        @CreationTimestamp
        private LocalDateTime createdAt;

        @Column(name = "updated_at")
        @UpdateTimestamp
        private LocalDateTime updatedAt;

//        @ApiModelProperty(value = "Telefones")
//        @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST,CascadeType.REMOVE,CascadeType.MERGE})
//        private List<Phone> phones;
    }


