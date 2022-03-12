package co.com.sofka.domain.ArProfesor.values;
import co.com.sofka.domain.generic.ValueObject;
import java.util.*;
public class Preguntas implements ValueObject<Set<String>> {

    private final Set<String> preguntas;

    public Preguntas( Set<String> preguntas) {
        this.preguntas = preguntas;

    }

    @Override
    public Set<String> value() {
        return preguntas;
    }
}
