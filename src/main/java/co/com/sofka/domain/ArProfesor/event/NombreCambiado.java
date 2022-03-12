package co.com.sofka.domain.ArProfesor.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generic.NombreCompleto;

public class NombreCambiado extends DomainEvent {
   private final NombreCompleto nombreprofe;

    public NombreCambiado(NombreCompleto nombreprofe) {
        super("profesor.NombreCambiado");
        this.nombreprofe = nombreprofe;
    }

    public NombreCompleto getNombreprofe() {
        return nombreprofe;
    }
}
