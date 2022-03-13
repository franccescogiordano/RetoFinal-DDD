package co.com.sofka.domain.ArAlumno.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generics.Orientacion;

public class OrientacionCambiada extends DomainEvent {
    private final Orientacion orientacion;

    public OrientacionCambiada(Orientacion orientacion) {
        super("aralumno.event.orientacioncambiada");
        this.orientacion = orientacion;
    }

    public Orientacion getOrientacion() {
        return orientacion;
    }
}
