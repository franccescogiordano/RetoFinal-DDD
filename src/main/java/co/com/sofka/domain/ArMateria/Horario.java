package co.com.sofka.domain.ArMateria;

import co.com.sofka.domain.ArMateria.values.Dias;
import co.com.sofka.domain.ArMateria.values.HoraFin;
import co.com.sofka.domain.ArMateria.values.HoraInicio;
import co.com.sofka.domain.ArMateria.values.HorarioID;
import co.com.sofka.domain.generic.Entity;

public class Horario extends Entity<HorarioID> {
    private final Dias dias;
    private final HoraInicio horaInicio;
    private final HoraFin horaFin;

    public Horario(HorarioID entityId, Dias dias, HoraInicio horaInicio, HoraFin horaFin) {
        super(entityId);
        this.dias = dias;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public Dias dias() {
        return dias;
    }

    public HoraInicio horaInicio() {
        return horaInicio;
    }

    public HoraFin horaFin() {
        return horaFin;
    }
}
