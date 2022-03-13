package co.com.sofka.domain.ArMateria.events;

import co.com.sofka.domain.ArMateria.Credito;
import co.com.sofka.domain.generic.DomainEvent;

public class CreditoEditado extends DomainEvent {
    private final Credito credito;

    public CreditoEditado(Credito credito) {
        super("armateria.events.creditoeditado");
        this.credito = credito;
    }

    public Credito getCredito() {
        return credito;
    }
}
