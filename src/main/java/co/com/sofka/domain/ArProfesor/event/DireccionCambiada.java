package co.com.sofka.domain.ArProfesor.event;

import co.com.sofka.domain.generics.Direccion;
import co.com.sofka.domain.generic.DomainEvent;

public class DireccionCambiada extends DomainEvent {
    private final Direccion direccion;

    public DireccionCambiada(Direccion direccion) {
        super("arprofesor.event.direccioncambiada");
        this.direccion = direccion;
    }

    public Direccion getDireccion() {
        return direccion;
    }
}
