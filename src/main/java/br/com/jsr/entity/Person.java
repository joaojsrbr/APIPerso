package br.com.jsr.entity;


import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.hibernate.Hibernate;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;


@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Person {

        @Id
        @ApiModelProperty(value = "ID")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @ApiModelProperty(value = "Primeiro Nome")
        @Column(nullable = false)
        private String firstName;

        @ApiModelProperty(value = "Último Nome")
        @Column(nullable = false)
        private String lastName;

//        @ApiModelProperty(value = "CPF")
//        @Column(nullable = false, unique = true)
//        private String cpf;

        @CreationTimestamp
        @Temporal(TemporalType.TIMESTAMP)
        @Column(name = "create_date")
        private Date createDate;

        @UpdateTimestamp
        @Temporal(TemporalType.TIMESTAMP)
        @Column(name = "modify_date")
        private Date modifyDate;

//        @ApiModelProperty(value = "Telefones")
//        @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST,CascadeType.REMOVE,CascadeType.MERGE})
//        private List<Phone> phones;

        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
                Person person = (Person) o;
                return id != null && Objects.equals(id, person.id);
        }

        @Override
        public int hashCode() {
                return getClass().hashCode();
        }
}


