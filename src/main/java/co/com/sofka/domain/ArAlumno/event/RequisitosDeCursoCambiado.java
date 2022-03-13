package co.com.sofka.domain.ArAlumno.event;

import co.com.sofka.domain.ArAlumno.values.Requisitos;
import co.com.sofka.domain.generic.DomainEvent;

public class RequisitosDeCursoCambiado extends DomainEvent {
    private final Requisitos requisitos;

    public RequisitosDeCursoCambiado(Requisitos requisitos) {
        super("arlumno.event.requisitosdecursocambiado");
        this.requisitos = requisitos;
    }

    public Requisitos getRequisitos() {
        return requisitos;
    }
}
