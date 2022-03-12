package co.com.sofka.domain.ArProfesor.values;

import co.com.sofka.domain.generic.ValueObject;

public class CantidadAlumnos implements ValueObject<Integer> {

    private final Integer cantidad;

    public CantidadAlumnos(Integer cantidad) {
        this.cantidad = cantidad;

    }

    @Override
    public Integer value() {
        return cantidad;
    }
}