package co.com.sofka.domain.ArAlumno.event;

import co.com.sofka.domain.ArAlumno.values.HoraInicioFin;
import co.com.sofka.domain.generic.DomainEvent;

public class HorarioCursoCambiado extends DomainEvent {
    private final HoraInicioFin horaInicioFin;

    public HorarioCursoCambiado(HoraInicioFin horaInicioFin) {
        super("aralumno.event.horariocursocambiado");
        this.horaInicioFin = horaInicioFin;
    }

    public HoraInicioFin getHoraInicioFin() {
        return horaInicioFin;
    }
}
