package co.com.sofka.domain.ArMateria.values;

import co.com.sofka.domain.generic.ValueObject;

public class NombreMateria implements ValueObject<String> {

    private final String nombreMateria;

    public NombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;

    }

    @Override
    public String value() {
        return nombreMateria;
    }
}
