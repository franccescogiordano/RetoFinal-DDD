package co.com.sofka.domain.ArMateria.values;

import co.com.sofka.domain.generic.ValueObject;


public class Importancia implements ValueObject<String> {
    private final String importancia;


    public Importancia(String importancia) {
        this.importancia= importancia;

    }

    @Override
    public String value() {
        return importancia;
    }
}

