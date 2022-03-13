package co.com.sofka.domain.ArMateria.command;

import co.com.sofka.domain.ArMateria.Horario;
import co.com.sofka.domain.generic.Command;

public class CrearHorario extends Command {
    private final Horario horario;

    public CrearHorario(Horario horario) {
        this.horario = horario;
    }

    public Horario getHorario() {
        return horario;
    }
}
