package co.com.sofka.domain.ArAlumno.event;

import co.com.sofka.domain.ArAlumno.values.Promedio;
import co.com.sofka.domain.generic.DomainEvent;

public class PromedioNotaCambiada extends DomainEvent {
    private final Promedio promedio;

    public PromedioNotaCambiada(Promedio promedio) {
        super("aralumno.event.promedionotacambiada");
        this.promedio = promedio;
    }

    public Promedio getPromedio() {
        return promedio;
    }
}
