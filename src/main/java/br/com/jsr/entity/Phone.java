package br.com.jsr.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import br.com.jsr.enums.PhoneType;
import org.springframework.lang.Nullable;

import javax.persistence.*;


@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Phone {
    @ApiModelProperty(value = "ID")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ApiModelProperty(value = "Tipo De Telefone")
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PhoneType type;

    @ApiModelProperty(value = "Numero")
    @Column(nullable = false)
    private String number;

}
