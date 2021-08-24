package br.com.jsr.enums;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PhoneType {

    RESIDENCIAL("Telefone Fixo Residencial"),
    CELULAR("Celular"),
    COMERCIAL("Telefone Comercial");

        private final String description;
}
