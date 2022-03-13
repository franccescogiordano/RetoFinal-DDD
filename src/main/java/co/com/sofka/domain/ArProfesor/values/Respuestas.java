package co.com.sofka.domain.ArProfesor.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;
import java.util.Set;

public class Respuestas implements ValueObject<Set<String>> {

    private final Set<String> respuestas;


    public Respuestas( Set<String> respuestas) {
        this.respuestas = Objects.requireNonNull(respuestas);
        if (this.respuestas.isEmpty()) {
            throw new IllegalArgumentException("Las respuestas no pueden estar vacias");
        }

    }

    @Override
    public Set<String> value() {
        return respuestas;
    }
}
