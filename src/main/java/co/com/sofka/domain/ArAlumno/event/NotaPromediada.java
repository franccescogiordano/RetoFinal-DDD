package co.com.sofka.domain.ArAlumno.event;

import co.com.sofka.domain.ArAlumno.values.Promedio;
import co.com.sofka.domain.generic.DomainEvent;

public class NotaPromediada extends DomainEvent {
    private final Promedio promedio;

    public NotaPromediada(Promedio promedio) {
        super("aralumno.event.notapromediada");
        this.promedio = promedio;
    }

    public Promedio getPromedio() {
        return promedio;
    }
}
