package co.com.sofka.domain.ArMateria.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generics.AlumnoID;
import java.util.*;
public class AlumnosCargados extends DomainEvent {
    private final Set<AlumnoID> alumnos;

    public AlumnosCargados(Set<AlumnoID> alumnos) {
        super("armateria.events.alumnoscargados");
        this.alumnos = alumnos;
    }

    public Set<AlumnoID> getAlumnos() {
        return alumnos;
    }
}
