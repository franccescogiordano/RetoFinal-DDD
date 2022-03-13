package co.com.sofka.domain.ArMateria.events;

import co.com.sofka.domain.ArMateria.values.Dia;
import co.com.sofka.domain.ArMateria.values.HoraFin;
import co.com.sofka.domain.ArMateria.values.HoraInicio;
import co.com.sofka.domain.generic.DomainEvent;

public class FechaExamenCambiada extends DomainEvent {
    private final HoraInicio horaInicio;
    private final HoraFin horaFin;
    private final Dia dia;

    public FechaExamenCambiada(HoraInicio horaInicio, HoraFin horaFin, Dia dia) {
      super("armateria.events.fechaexamencambiada");
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.dia = dia;
    }

    public Dia getDia() {
        return dia;
    }

    public HoraFin getHoraFin() {
        return horaFin;
    }

    public HoraInicio getHoraInicio() {
        return horaInicio;
    }
}
