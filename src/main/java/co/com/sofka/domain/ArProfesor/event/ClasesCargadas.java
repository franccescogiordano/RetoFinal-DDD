package co.com.sofka.domain.ArProfesor.event;

import co.com.sofka.domain.ArProfesor.Clase;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.Set;

public class ClasesCargadas extends DomainEvent {
    private final Set<Clase> clases;

    public ClasesCargadas(Set<Clase> clases) {
        super("arprofesor.event.clasescargadas");
        this.clases=clases;
    }

    public Set<Clase> getClases() {
        return clases;
    }

}
