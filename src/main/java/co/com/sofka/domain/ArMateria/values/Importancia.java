package co.com.sofka.domain.ArMateria.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;


public class Importancia implements ValueObject<String> {
    private final String importancia;


    public Importancia(String importancia) {
        this.importancia = Objects.requireNonNull(importancia);
        if (this.importancia.isBlank()) {
            throw new IllegalArgumentException(" importancia no puede estar vacio");
        }

    }

    @Override
    public String value() {
        return importancia;
    }
}

