package co.com.sofka.domain.ArMateria.values;

import co.com.sofka.domain.generic.ValueObject;

public class Estado implements ValueObject<Boolean> {
    private final Boolean estado;


    public Estado(Boolean estado) {
        this.estado= estado;

    }

    @Override
    public Boolean value() {
        return estado;
    }
}
