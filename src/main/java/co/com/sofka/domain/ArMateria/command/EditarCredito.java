package co.com.sofka.domain.ArMateria.command;

import co.com.sofka.domain.ArMateria.Credito;
import co.com.sofka.domain.generic.Command;

public class EditarCredito extends Command {
    private final Credito credito;

    public EditarCredito(Credito credito) {
        this.credito = credito;
    }

    public Credito getCredito() {
        return credito;
    }
}
