package co.com.sofka.domain.ArProfesor.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generics.Orientacion;

import java.util.Set;

public class OrientacionesCargadas extends DomainEvent {
    private final Set<Orientacion> orientacions;

    public OrientacionesCargadas(Set<Orientacion> orientacions) {
        super("arprofesor.event.orientacionescargadas");
        this.orientacions=orientacions;
    }

    public Set<Orientacion> getOrientaciones() {
        return orientacions;
    }
}
