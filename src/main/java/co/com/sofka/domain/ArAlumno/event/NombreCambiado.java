package co.com.sofka.domain.ArAlumno.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generics.NombreCompleto;

public class NombreCambiado extends DomainEvent {
    private final NombreCompleto nombre;

    public NombreCambiado(NombreCompleto nombre) {
        super("aralumno.event.nombrecambiado");
        this.nombre = nombre;
    }

    public NombreCompleto getNombreAlum() {
        return nombre;
    }
}
