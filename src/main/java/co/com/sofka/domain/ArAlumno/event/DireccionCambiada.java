package co.com.sofka.domain.ArAlumno.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generics.Direccion;

public class DireccionCambiada extends DomainEvent {
    private final Direccion direccion;

    public DireccionCambiada(Direccion direccion) {
        super("aralumno.event.direccioncambiada");
        this.direccion = direccion;
    }

    public Direccion getDireccion() {
        return direccion;
    }
}
