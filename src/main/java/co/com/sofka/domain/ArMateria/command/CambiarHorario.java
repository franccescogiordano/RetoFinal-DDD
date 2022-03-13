package co.com.sofka.domain.ArMateria.command;

import co.com.sofka.domain.ArMateria.Horario;
import co.com.sofka.domain.generic.Command;

public class CambiarHorario extends Command {
    private final Horario horario;


    public CambiarHorario(Horario horario) {
        this.horario = horario;
    }

    public Horario getHorario() {
        return horario;
    }
}
