package co.com.sofka.domain.ArMateria.values;

import co.com.sofka.domain.generic.ValueObject;

public class HoraInicio implements ValueObject<String> {

    private final String horainicio;

    public HoraInicio(String horainicio) {
        this.horainicio = horainicio;

    }

    @Override
    public String value() {
        return horainicio;
    }
}
