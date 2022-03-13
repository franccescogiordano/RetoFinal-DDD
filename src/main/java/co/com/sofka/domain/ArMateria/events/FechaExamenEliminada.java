package co.com.sofka.domain.ArMateria.events;

import co.com.sofka.domain.ArMateria.FechaExamen;
import co.com.sofka.domain.generic.DomainEvent;

public class FechaExamenEliminada extends DomainEvent {
    private final FechaExamen fechaExamen;

    public FechaExamenEliminada(FechaExamen fechaExamen) {
       super("armateria.events.fechaexameneliminada");
        this.fechaExamen = fechaExamen;
    }

    public FechaExamen getFechaExamen() {
        return fechaExamen;
    }
}
