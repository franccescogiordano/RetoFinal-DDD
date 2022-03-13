package co.com.sofka.domain.ArAlumno.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generics.Orientacion;

public class OrientacionCursoDefinida extends DomainEvent {
    private final Orientacion orientacion;

    public OrientacionCursoDefinida(Orientacion orientacion) {
        super("aralumno.event.orientacioncursodefinida");
        this.orientacion = orientacion;
    }

    public Orientacion getOrientacion() {
        return orientacion;
    }
}
