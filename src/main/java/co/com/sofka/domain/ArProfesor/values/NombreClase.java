package co.com.sofka.domain.ArProfesor.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NombreClase implements ValueObject<String> {

    private final String nombre;

    public NombreClase(String nombre) {
        this.nombre = Objects.requireNonNull(nombre);
        if (this.nombre.isBlank()) {
            throw new IllegalArgumentException("EL nombre no puede estar vacio");
        }

    }

    @Override
    public String value() {
        return nombre;
    }


}