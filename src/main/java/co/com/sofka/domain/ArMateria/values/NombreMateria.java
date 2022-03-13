package co.com.sofka.domain.ArMateria.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NombreMateria implements ValueObject<String> {

    private final String nombreMateria;

    public NombreMateria(String nombreMateria) {
        this.nombreMateria = Objects.requireNonNull(nombreMateria);
        if (this.nombreMateria.isBlank()) {
            throw new IllegalArgumentException("EL nombreMateria no puede estar vacio");
        }

    }

    @Override
    public String value() {
        return nombreMateria;
    }
}
