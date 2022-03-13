package co.com.sofka.domain.ArAlumno.event;

import co.com.sofka.domain.ArAlumno.Beca;
import co.com.sofka.domain.generic.DomainEvent;

public class BecaRemovida extends DomainEvent {
    private final Beca beca;

    public BecaRemovida(Beca beca) {
        super("aralumno.event.becaremovida");
        this.beca = beca;
    }

    public Beca getBeca() {
        return beca;
    }
}
