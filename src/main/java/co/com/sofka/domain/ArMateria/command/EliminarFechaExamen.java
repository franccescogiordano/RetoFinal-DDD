package co.com.sofka.domain.ArMateria.command;

import co.com.sofka.domain.ArMateria.FechaExamen;
import co.com.sofka.domain.generic.Command;

public class EliminarFechaExamen extends Command {
    private final FechaExamen fechaExamen;

    public EliminarFechaExamen(FechaExamen fechaExamen) {
        this.fechaExamen = fechaExamen;
    }

    public FechaExamen getFechaExamen() {
        return fechaExamen;
    }
}
