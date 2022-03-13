package co.com.sofka.domain.ArMateria.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generics.Orientacion;

public class OrientacionElegida extends DomainEvent {
    private final Orientacion orientacion;

    public OrientacionElegida(Orientacion orientacion) {
        super("armateria.events.orientacionelegida");
        this.orientacion = orientacion;
    }

    public Orientacion getOrientacion() {
        return orientacion;
    }
}
