package co.com.sofka.domain.ArProfesor.event;

import co.com.sofka.domain.generic.Direccion;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generic.NombreCompleto;

public class DireccionCambiada extends DomainEvent {
    private final Direccion direccion;

    public DireccionCambiada(Direccion direccion) {
        super("profesor.DireccionCambiada");
        this.direccion = direccion;
    }

    public Direccion getDireccion() {
        return direccion;
    }
}
