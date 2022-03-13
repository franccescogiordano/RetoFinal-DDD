package co.com.sofka.domain.ArMateria.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generics.ProfesorID;
import java.util.*;
public class ProfesoresCargados extends DomainEvent {
    private final Set<ProfesorID> profes;

    public ProfesoresCargados(Set<ProfesorID> profes) {
        super("armateria.events.profesorescargados");

        this.profes = profes;
    }

    public Set<ProfesorID> getProfes() {
        return profes;
    }
}
