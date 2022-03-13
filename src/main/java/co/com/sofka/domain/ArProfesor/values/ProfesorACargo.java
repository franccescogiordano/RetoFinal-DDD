package co.com.sofka.domain.ArProfesor.values;

import co.com.sofka.domain.generics.ProfesorID;
import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class ProfesorACargo implements ValueObject<String> {

    private final String nombre;
    private final ProfesorID profesorID;

    public ProfesorACargo(String nombre,ProfesorID profesorID) {
        this.nombre = Objects.requireNonNull(nombre);
        if (this.nombre.isBlank()) {
            throw new IllegalArgumentException("EL nombre no puede estar vacio");
        }
        this.profesorID=profesorID;
    }

    @Override
    public String value() {
        return nombre;
    }
}