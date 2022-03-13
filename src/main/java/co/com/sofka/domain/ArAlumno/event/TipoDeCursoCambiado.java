package co.com.sofka.domain.ArAlumno.event;

import co.com.sofka.domain.ArAlumno.values.Tipo;
import co.com.sofka.domain.generic.DomainEvent;

public class TipoDeCursoCambiado extends DomainEvent {
    private final Tipo tipo;

    public TipoDeCursoCambiado(Tipo tipo) {
        super("aralumno.event.tipodecursocambiado");
        this.tipo = tipo;
    }

    public Tipo getTipo() {
        return tipo;
    }
}
