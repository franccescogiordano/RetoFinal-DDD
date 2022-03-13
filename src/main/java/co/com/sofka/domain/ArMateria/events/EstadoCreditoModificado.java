package co.com.sofka.domain.ArMateria.events;

import co.com.sofka.domain.ArMateria.values.Estado;
import co.com.sofka.domain.generic.DomainEvent;

public class EstadoCreditoModificado extends DomainEvent {
    private final Estado estado;

    public EstadoCreditoModificado(Estado estado) {
        super("armateria.events.estadocreditomodificado");
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }
}
