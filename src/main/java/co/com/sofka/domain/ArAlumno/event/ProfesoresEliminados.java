package co.com.sofka.domain.ArAlumno.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generics.ProfesorID;

import java.util.Set;

public class ProfesoresEliminados extends DomainEvent {
    private final Set<ProfesorID> profes;

    public ProfesoresEliminados(Set<ProfesorID> profes) {
        super("aralumno.event.profesoreseliminados");

        this.profes = profes;
    }

    public Set<ProfesorID> getProfes() {
        return profes;
    }
}
