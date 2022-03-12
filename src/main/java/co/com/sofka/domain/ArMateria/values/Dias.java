package co.com.sofka.domain.ArMateria.values;

import co.com.sofka.domain.generic.ValueObject;

public class Dias  implements ValueObject<String> {

    private final String dias;

    public Dias(String dias) {
        this.dias = dias;

    }

    @Override
    public String value() {
        return dias;
    }
}
