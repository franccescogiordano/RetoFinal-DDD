package co.com.sofka.domain.ArMateria.events;

import co.com.sofka.domain.ArMateria.Horario;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.*;
public class HorariosCargados extends DomainEvent {
    private final Set<Horario> horarios;

    public HorariosCargados(Set<Horario> horarios) {
        super("armateria.events.horarioscargados");

        this.horarios = horarios;
    }

    public Set<Horario> getHorarios() {
        return horarios;
    }
}
