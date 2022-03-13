package co.com.sofka.domain.ArMateria.events;

import co.com.sofka.domain.ArMateria.Credito;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generics.AlumnoID;

public class CreditosOtorgados extends DomainEvent {
    private final AlumnoID idalumno;
    private final Credito credito;

    public CreditosOtorgados(AlumnoID idalumno, Credito credito) {
       super("armateria.events.creditosotorgados");
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
