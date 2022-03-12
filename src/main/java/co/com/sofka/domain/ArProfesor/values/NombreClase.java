package co.com.sofka.domain.ArProfesor.values;

import co.com.sofka.domain.generic.ValueObject;

public class NombreClase implements ValueObject<String> {

    private final String nombre;

    public NombreClase(String nombre) {
        this.nombre = nombre;

    }

    @Override
    public String value() {
        return nombre;
    }
}