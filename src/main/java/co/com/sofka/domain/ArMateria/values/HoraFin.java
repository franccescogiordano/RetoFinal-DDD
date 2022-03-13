package co.com.sofka.domain.ArMateria.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class HoraFin implements ValueObject<String> {

    private final String horafin;

    public HoraFin(String horafin) {
        this.horafin = Objects.requireNonNull(horafin);
        if (this.horafin.isBlank()) {
            throw new IllegalArgumentException(" horafin no puede estar vacio");
        }

    }

    @Override
    public String value() {
        return horafin;
    }
}
