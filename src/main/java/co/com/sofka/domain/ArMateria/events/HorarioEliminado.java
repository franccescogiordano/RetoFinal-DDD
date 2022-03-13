package co.com.sofka.domain.ArMateria.events;

import co.com.sofka.domain.ArMateria.Horario;
import co.com.sofka.domain.generic.DomainEvent;

public class HorarioEliminado extends DomainEvent {
    private final Horario horario;

    public HorarioEliminado(Horario horario) {
        super("armateria.events.horarioeliminado");
        this.horario = horario;
    }

    public Horario getHorario() {
        return horario;
    }
}
