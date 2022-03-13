package co.com.sofka.domain.ArAlumno.event;

import co.com.sofka.domain.ArAlumno.Beca;
import co.com.sofka.domain.generic.DomainEvent;

public class BecaModificada extends DomainEvent {
    private final Beca beca;

    public BecaModificada(Beca beca) {

        super("aralumno.event.becamodificada");
        this.beca = beca;

    }

    public Beca getBeca() {
        return beca;
    }
}
