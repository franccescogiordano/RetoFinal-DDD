package co.com.sofka.domain.ArAlumno.event;

import co.com.sofka.domain.ArMateria.values.Estado;
import co.com.sofka.domain.generic.DomainEvent;

public class EstadoBecaModificado extends DomainEvent {
    private final Estado estado;

    public EstadoBecaModificado(Estado estado) {
        super("aralumno.event.estadobecamodificado");
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }
}
