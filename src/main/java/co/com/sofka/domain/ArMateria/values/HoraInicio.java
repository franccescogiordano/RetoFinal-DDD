package co.com.sofka.domain.ArMateria.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class HoraInicio implements ValueObject<String> {

    private final String horainicio;

    public HoraInicio(String horainicio) {
        this.horainicio = Objects.requireNonNull(horainicio);
        if (this.horainicio.isBlank()) {
            throw new IllegalArgumentException("EL nombreMateria no puede estar vacio");
        }

    }

    @Override
    public String value() {
        return horainicio;
    }
}
