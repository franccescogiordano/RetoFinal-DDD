package co.com.sofka.domain.ArProfesor.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generics.NombreCompleto;

public class CambiarNombre extends Command {
    private final NombreCompleto nombre;

    public CambiarNombre(NombreCompleto nombre) {
        this.nombre = nombre;
    }

    public NombreCompleto getNombre() {
        return nombre;
    }
}
