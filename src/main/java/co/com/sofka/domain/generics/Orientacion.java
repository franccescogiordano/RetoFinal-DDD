package co.com.sofka.domain.generics;

import co.com.sofka.domain.generic.ValueObject;

public class Orientacion implements ValueObject<String> {

    private final String orientacion;
    private final String dificultad;

    public Orientacion(String orientacion, String dificultad) {
        this.orientacion = orientacion;
        this.dificultad = dificultad;
    }

    @Override
    public String value() {
        return orientacion;
    }
}