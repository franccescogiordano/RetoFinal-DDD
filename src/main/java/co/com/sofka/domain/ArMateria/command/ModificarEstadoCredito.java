package co.com.sofka.domain.ArMateria.command;

import co.com.sofka.domain.ArMateria.values.Estado;
import co.com.sofka.domain.generic.Command;

public class ModificarEstadoCredito extends Command {
    private final Estado estado;

    public ModificarEstadoCredito(Estado estado) {
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }
}
