package co.com.sofka.domain.ArMateria.command;

import co.com.sofka.domain.ArMateria.Credito;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generics.AlumnoID;

public class OtorgarCredito extends Command {
    private final AlumnoID idalumno;
    private final Credito credito;

    public OtorgarCredito(AlumnoID idalumno, Credito credito) {

        this.idalumno = idalumno;
        this.credito = credito;
    }

    public Credito getCredito() {
        return credito;
    }

    public AlumnoID getIdalumno() {
        return idalumno;
    }
}
