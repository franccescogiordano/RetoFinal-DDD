package co.com.sofka.domain.ArProfesor.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Set;

public class Respuestas implements ValueObject<Set<String>> {

    private final Set<String> respuestas;


    public Respuestas( Set<String> respuestas) {
        this.respuestas = respuestas;

    }

    @Override
    public Set<String> value() {
        return respuestas;
    }
}
