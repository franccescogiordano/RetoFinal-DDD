package co.com.sofka.domain.ArMateria.events;

import co.com.sofka.domain.ArMateria.values.NombreMateria;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreMateriaCambiado extends DomainEvent {
    private final NombreMateria nombreMateria;

    public NombreMateriaCambiado(NombreMateria nombreMateria) {
        super("armateria.events.nombremateriacambiado");
        this.nombreMateria = nombreMateria;
    }

    public NombreMateria getNombreMateria() {
        return nombreMateria;
    }
}
