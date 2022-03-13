package co.com.sofka.domain.ArMateria.events;

import co.com.sofka.domain.ArAlumno.values.Tipo;
import co.com.sofka.domain.generic.DomainEvent;

public class TipoMateriaCambiado extends DomainEvent {
    private final Tipo tipo;

    public TipoMateriaCambiado(Tipo tipo) {
        super("armateria.events.tipomateriacambiado");
        this.tipo = tipo;
    }

    public Tipo getTipo() {
        return tipo;
    }
}
