package co.com.sofka.domain.ArMateria.events;

import co.com.sofka.domain.ArProfesor.values.ExamenID;
import co.com.sofka.domain.generic.DomainEvent;

public class FechaExamenCambiadaPorID extends DomainEvent {
    private final ExamenID idexamen;

    public FechaExamenCambiadaPorID(ExamenID idexamen) {
        super("armateria.events.fechaexamencambiadaporid");
        this.idexamen = idexamen;
    }

    public ExamenID getIdexamen() {
        return idexamen;
    }
}
