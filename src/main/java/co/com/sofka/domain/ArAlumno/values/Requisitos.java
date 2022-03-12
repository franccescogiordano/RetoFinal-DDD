package co.com.sofka.domain.ArAlumno.values;

import co.com.sofka.domain.generic.ValueObject;

public class Requisitos implements ValueObject<String> {

    private final String requisitos;

    public Requisitos(String requisitos) {
        this.requisitos = requisitos;

    }

    @Override
    public String value() {
        return requisitos;
    }
}
