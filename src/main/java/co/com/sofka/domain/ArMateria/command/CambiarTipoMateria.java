package co.com.sofka.domain.ArMateria.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.ArAlumno.values.Tipo;
public class CambiarTipoMateria extends Command {
    private final Tipo tipomateria;

    public CambiarTipoMateria(Tipo tipomateria) {
        this.tipomateria = tipomateria;
    }

    public Tipo getTipomateria() {
        return tipomateria;
    }
}
