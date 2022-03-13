package co.com.sofka.domain.ArProfesor.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generics.Direccion;

public class CambiarDireccion extends Command {
    private final Direccion dir;

    public CambiarDireccion(Direccion dir) {
        this.dir = dir;
    }

    public Direccion getDir() {
        return dir;
    }
}
