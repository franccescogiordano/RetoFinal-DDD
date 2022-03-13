package co.com.sofka.domain.ArMateria.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generics.Orientacion;

public class ElegirOrientacion extends Command {
    private final Orientacion orientacion;

    public ElegirOrientacion(Orientacion orientacion) {
        this.orientacion = orientacion;
    }

    public Orientacion getOrientacion() {
        return orientacion;
    }
}
