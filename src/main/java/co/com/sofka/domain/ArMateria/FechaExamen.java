package co.com.sofka.domain.ArMateria;

import co.com.sofka.domain.ArMateria.values.Dia;
import co.com.sofka.domain.ArMateria.values.FechaExamenID;
import co.com.sofka.domain.ArMateria.values.HoraFin;
import co.com.sofka.domain.ArMateria.values.HoraInicio;
import co.com.sofka.domain.ArProfesor.values.ExamenID;
import co.com.sofka.domain.generic.Entity;

public class FechaExamen extends Entity<FechaExamenID> {
private final HoraInicio horaInicio;
private final HoraFin horaFin;
private final Dia dia; 
private final ExamenID examenID;

    public FechaExamen(FechaExamenID entityId, HoraInicio horaInicio, HoraFin horaFin, Dia dia, ExamenID examenID) {
        super(entityId);
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.dia = dia;
        this.examenID = examenID;
    }

    public HoraInicio horaInicio() {
        return horaInicio;
    }

    public HoraFin horaFin() {
        return horaFin;
    }

    public Dia dia() {
        return dia;
    }

    public ExamenID examenID() {
        return examenID;
    }
}
