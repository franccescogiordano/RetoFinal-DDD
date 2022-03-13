package co.com.sofka.domain.ArMateria.command;

import co.com.sofka.domain.ArMateria.values.Dia;
import co.com.sofka.domain.ArMateria.values.HoraFin;
import co.com.sofka.domain.ArMateria.values.HoraInicio;
import co.com.sofka.domain.generic.Command;

public class CambiarExamenFecha extends Command {

    private final HoraInicio horaInicio;
    private final HoraFin horaFin;
    private final Dia dia;

    public CambiarExamenFecha(HoraInicio horaInicio, HoraFin horaFin, Dia dia) {

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
