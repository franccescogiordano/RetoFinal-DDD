package co.com.sofka.domain.ArProfesor.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generics.Orientacion;

public class CambiarOrientacionClase extends Command {
    private final Orientacion orientacion;

    public CambiarOrientacionClase(Orientacion orientacion) {
        this.orientacion = orientacion;
    }

    public Orientacion getOrientacion() {
        return orientacion;
    }
}
