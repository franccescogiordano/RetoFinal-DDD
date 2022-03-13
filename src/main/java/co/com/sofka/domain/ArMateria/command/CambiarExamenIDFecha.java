package co.com.sofka.domain.ArMateria.command;

import co.com.sofka.domain.ArProfesor.values.ExamenID;
import co.com.sofka.domain.generic.Command;

public class CambiarExamenIDFecha extends Command {
    private final ExamenID idexamen;

    public CambiarExamenIDFecha(ExamenID idexamen) {
        this.idexamen = idexamen;
    }

    public ExamenID getIdexamen() {
        return idexamen;
    }
}
