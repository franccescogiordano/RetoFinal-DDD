package co.com.sofka.domain.ArMateria.events;

import co.com.sofka.domain.ArMateria.Horario;
import co.com.sofka.domain.generic.DomainEvent;

public class HorarioCambiado extends DomainEvent {
    private final Horario horario;

    public HorarioCambiado(Horario horario) {
        super("armateria.events.horariocambiado");
        this.horario = horario;
    }

    public Horario getHorario() {
        return horario;
    }
}
