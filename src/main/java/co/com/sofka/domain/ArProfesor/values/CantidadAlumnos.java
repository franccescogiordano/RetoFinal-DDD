package co.com.sofka.domain.ArProfesor.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class CantidadAlumnos implements ValueObject<Integer> {

    private final Integer cantidad;

    public CantidadAlumnos(Integer cantidad) {
        this.cantidad = Objects.requireNonNull(cantidad);
        if (this.cantidad<0) {
            throw new IllegalArgumentException("la cantiadad no puede ser menor a 0");
        }

    }

    @Override
    public Integer value() {
        return cantidad;
    }
}