package co.com.sofka.domain.ArAlumno.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generics.ProfesorID;

import java.util.Set;

public class ProfesoresCargados extends DomainEvent {
    private final Set<ProfesorID> profes;

    public ProfesoresCargados(Set<ProfesorID> profes) {
        super("aralumno.event.profesorescargados");

        this.profes = profes;
    }

    public Set<ProfesorID> getProfes() {
        return profes;
    }
}
