package co.com.sofka.domain.ArProfesor.event;

import co.com.sofka.domain.ArProfesor.values.ProfesorACargo;
import co.com.sofka.domain.generic.DomainEvent;
//TODO Meter en el eventchange
public class ProfesorACargoDeClaseCambiada extends DomainEvent {
    private final ProfesorACargo profesorACargo;
    public ProfesorACargoDeClaseCambiada( ProfesorACargo profesorACargo){
        super("profesor.proferoacargodelaclasecambiada");
        this.profesorACargo=profesorACargo;

    }

    public ProfesorACargo getProfesorACargo() {
        return profesorACargo;
    }
}
