package co.com.sofka.domain.ArProfesor.values;

import co.com.sofka.domain.generic.ValueObject;

public class Uso implements ValueObject<String> {

    private final String uso;

    public Uso(String uso) {
        this.uso = uso;

    }

    @Override
    public String value() {
        return uso;
    }
}
