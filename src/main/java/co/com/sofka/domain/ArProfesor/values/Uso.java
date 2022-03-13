package co.com.sofka.domain.ArProfesor.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Uso implements ValueObject<String> {

    private final String uso;

    public Uso(String uso) {
        this.uso = Objects.requireNonNull(uso);
        if (this.uso.isBlank()) {
            throw new IllegalArgumentException("EL uso no puede estar vacio");
        }

    }

    @Override
    public String value() {
        return uso;
    }
}
